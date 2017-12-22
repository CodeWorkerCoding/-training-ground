package com.nchu.learn.config;

import com.nchu.learn.model.enums.EventEnum;
import com.nchu.learn.model.enums.StateEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigBuilder;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.statemachine.listener.StateMachineListener;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;

import java.util.EnumSet;

/**
 * 状态机官方配置
 *
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/14 19:06
 */
//@Configuration
//@EnableStateMachine
public class StateMachineConfig extends EnumStateMachineConfigurerAdapter<StateEnum, EventEnum> {


    Logger logger = LoggerFactory.getLogger(getClass());
    //@Autowired
    private SelfStateMachineListenerAdapter selfStateMachineListenerAdapter;

    @Override
    public void configure(StateMachineStateConfigurer<StateEnum, EventEnum> states) throws Exception {
        states.withStates().initial(StateEnum.UNPAID).states(EnumSet.allOf(StateEnum.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<StateEnum, EventEnum> transitions) throws Exception {
        transitions.withExternal().source(StateEnum.UNPAID).target(StateEnum.WAIT_FOR_RECEIVE)
                .event(EventEnum.PAY).and()
                .withExternal().source(StateEnum.WAIT_FOR_RECEIVE).target(StateEnum.DONE)
                .event(EventEnum.RECEIVE);
    }

    @Override
    public void configure(StateMachineConfigurationConfigurer<StateEnum, EventEnum> config) throws Exception {
        config.withConfiguration().listener(selfStateMachineListenerAdapter);
    }
}
