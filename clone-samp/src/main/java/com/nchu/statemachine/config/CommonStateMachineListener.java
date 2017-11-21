package com.nchu.statemachine.config;

import com.alibaba.fastjson.JSONObject;
import com.nchu.statemachine.dto.MsgContextDo;
import com.nchu.statemachine.model.enums.MachineEventEnum;
import com.nchu.statemachine.model.enums.MachineStateEunm;
import com.nchu.statemachine.model.pojo.StateMachineConfig;
import com.nchu.statemachine.service.StateMachineConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.transition.Transition;
import org.springframework.stereotype.Component;

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
    private StateMachineConfigService stateMachineConfigService;

    public void onStateChange(State<MachineStateEunm, MachineEventEnum> state, Message<MachineEventEnum> message,
                              Transition<MachineStateEunm, MachineEventEnum> transition, StateMachine<MachineStateEunm,MachineEventEnum> stateMachine) {
        MessageHeaders messageHeader = message.getHeaders();
        MsgContextDo context = messageHeader.get("context", MsgContextDo.class);

        MachineStateEunm source = transition.getSource().getId();
        MachineEventEnum event = transition.getTrigger().getEvent();

        StateMachineConfig config = stateMachineConfigService.findByCategorySourceAndEvent(context.getMachineCategory(), source, event);

        //config.getMe


    }
}
