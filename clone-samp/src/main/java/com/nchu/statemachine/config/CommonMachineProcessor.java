package com.nchu.statemachine.config;

import com.alibaba.fastjson.JSONObject;
import com.nchu.statemachine.dto.MQContextDo;
import com.nchu.statemachine.dto.MsgContextDo;
import com.nchu.statemachine.helper.UUIdHelper;
import com.nchu.statemachine.model.enums.MachineEventEnum;
import com.nchu.statemachine.model.enums.MachineStateEunm;
import com.nchu.statemachine.model.pojo.StateMachineConfig;
import com.nchu.statemachine.service.StateMachineConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.StaticListableBeanFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.access.StateMachineAccess;
import org.springframework.statemachine.access.StateMachineFunction;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.config.model.StateData;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.support.DefaultStateMachineContext;
import org.springframework.statemachine.support.StateMachineInterceptor;
import org.springframework.statemachine.support.StateMachineInterceptorAdapter;
import org.springframework.statemachine.transition.Transition;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 统一的状态机处理器
 *
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 10:31
 */
@Slf4j
@Component
public class CommonMachineProcessor {

    @Autowired
    private StateMachineConfigService stateMachineConfigService;

    public StateMachine<MachineStateEunm, MachineEventEnum> stateMachine;

    @Autowired
    private CommonStateMachineListener commonStateMachineListener;



    public final static StateData<MachineStateEunm, MachineEventEnum>
            INIT_STATE = new StateData<MachineStateEunm, MachineEventEnum>(MachineStateEunm.INIT, true),
            end_State = new StateData<MachineStateEunm, MachineEventEnum>(MachineStateEunm.DONE);


    public String startMachine(Object executeContext) throws Exception {
        MsgContextDo msgContextDo = (MsgContextDo) executeContext;
        String machineCategory = msgContextDo.getMachineCategory();
        List<StateMachineConfig> machineConfigList = this.stateMachineConfigService.findByStateCategory(machineCategory);
        stateMachine = assembleMachine(machineConfigList);

        stateMachine.getStateMachineAccessor().doWithAllRegions(new StateMachineFunction<StateMachineAccess<MachineStateEunm, MachineEventEnum>>() {
            @Override
            public void apply(StateMachineAccess<MachineStateEunm, MachineEventEnum> function) {
                function.addStateMachineInterceptor(new StateMachineInterceptorAdapter<MachineStateEunm, MachineEventEnum>(){
                    @Override
                    public void preStateChange(State<MachineStateEunm, MachineEventEnum> state, Message<MachineEventEnum> message,
                                               Transition<MachineStateEunm, MachineEventEnum> transition, StateMachine<MachineStateEunm, MachineEventEnum> stateMachine) {
                        commonStateMachineListener.onStateChange(state, message, transition, stateMachine);
                    }
                });
            }
        });

        msgContextDo.setMachineId(UUIdHelper.uuid());

        StateMachineConfig config = machineConfigList.get(0);
        MachineStateEunm sourceState = config.getSourceState();
        Message event = MessageBuilder.withPayload(config.getEvent())
                .setHeader("executeParam", msgContextDo)
                .setHeader("machineId", msgContextDo.getMachineId())
                .setHeader("machineCategory", config.getMachineCategory())
                .setHeader("auto", false)
                .build();

        stateMachine.stop();
        stateMachine.getStateMachineAccessor()
                .doWithAllRegions(access-> access.resetStateMachine(
                        new DefaultStateMachineContext<MachineStateEunm, MachineEventEnum>(
                                sourceState, null, null, null
                        )));
        stateMachine.start();
        stateMachine.sendEvent(event);
        return "";
    }

    private StateMachine<MachineStateEunm, MachineEventEnum> assembleMachine(List<StateMachineConfig> configList) throws Exception {
        StateMachineBuilder.Builder<MachineStateEunm, MachineEventEnum> machineBuilder = StateMachineBuilder.builder();
        machineBuilder.configureConfiguration().withConfiguration().beanFactory(
                new StaticListableBeanFactory());

        Set<MachineStateEunm> stateSet = new HashSet<>();

        for (StateMachineConfig config : configList) {
            machineBuilder.configureTransitions().withExternal().source(config.getSourceState()).target(config.getTargetState())
                    .event(config.getEvent());
            stateSet.add(config.getTargetState());
        }

        machineBuilder.configureStates().withStates().initial(INIT_STATE.getState()).state(INIT_STATE.getState())
                .end(end_State.getState()).states(stateSet);

        StateMachine<MachineStateEunm, MachineEventEnum> machine = machineBuilder.build();
        return machine;
    }
}
