package com.nchu.statemachine.config;

import com.nchu.statemachine.dto.MsgContextDo;
import com.nchu.statemachine.model.enums.ExecutorContextEnum;
import com.nchu.statemachine.model.enums.MachineEventEnum;
import com.nchu.statemachine.model.enums.MachineStateEunm;
import com.nchu.statemachine.model.pojo.StateMachineConfig;
import com.nchu.statemachine.service.StateMachineConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.support.DefaultStateMachineContext;
import org.springframework.statemachine.transition.Transition;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;

/**
 * 统一状态机状态变更监听器
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 11:40
 */
@Component
@Slf4j
public class CommonStateMachineListener {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private StateMachineConfigService stateMachineConfigService;

    public void onStateChange(State<MachineStateEunm, MachineEventEnum> state, Message<MachineEventEnum> message,
                              Transition<MachineStateEunm, MachineEventEnum> transition, StateMachine<MachineStateEunm,MachineEventEnum> stateMachine) {
        MessageHeaders messageHeader = message.getHeaders();
        MsgContextDo msgContextDo = messageHeader.get("executeParam", MsgContextDo.class);

        MachineStateEunm source = transition.getSource().getId();
        MachineEventEnum event = transition.getTrigger().getEvent();

        StateMachineConfig config = stateMachineConfigService.findByCategorySourceAndEvent(msgContextDo.getMachineCategory(), source, event);

        Object object = applicationContext.getBean(config.getExecutorContext());
        Method method = ReflectionUtils.findMethod(object.getClass(), config.getExecutorMethod(), Object.class);
        Object retParam = ReflectionUtils.invokeMethod(method, object, msgContextDo.getExecuteParam());
        log.info("class [{}] method [{}] execute result [{}]", config.getExecutorContext(), config.getExecutorMethod(), retParam);
        stateMachine.stop();
        StateMachineConfig nextConfig = this.stateMachineConfigService.findByCategorySourceAndEvent(msgContextDo.getMachineCategory(), config.getTargetState(), config.getEvent());
        if (nextConfig != null) {
            stateMachine.getStateMachineAccessor()
                    .doWithAllRegions(access -> access.resetStateMachine(
                            new DefaultStateMachineContext<MachineStateEunm, MachineEventEnum>(nextConfig.getSourceState(),
                                    null, null, null)));
            stateMachine.start();
            stateMachine.sendEvent(MessageBuilder.withPayload(nextConfig.getEvent())
                    .setHeader("executeParam", msgContextDo)
                    .setHeader("machineId", msgContextDo.getMachineId())
                    .setHeader("machineCategory", config.getMachineCategory())
                    .setHeader("auto", false)
                    .build());
        }
    }
}
