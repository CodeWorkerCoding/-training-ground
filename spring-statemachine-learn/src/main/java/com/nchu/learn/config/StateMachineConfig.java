package com.nchu.learn.config;

import com.nchu.learn.model.enums.EventEnum;
import com.nchu.learn.model.enums.StateEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.statemachine.listener.StateMachineListener;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.transition.Transition;

import java.util.EnumSet;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/14 19:06
 */
@Configuration
@EnableStateMachine
public class StateMachineConfig extends EnumStateMachineConfigurerAdapter<StateEnum, EventEnum> {

    Logger logger = LoggerFactory.getLogger(getClass());

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
        config.withConfiguration().listener(listener());
    }

    @Bean
    public StateMachineListener<StateEnum, EventEnum> listener() {
        return new StateMachineListenerAdapter<StateEnum, EventEnum>() {
            @Override
            public void transition(Transition<StateEnum, EventEnum> transition) {
                if (transition.getTarget().getId() == StateEnum.UNPAID) {
                    logger.info("订单创建，待支付");
                    return;
                }
                if (transition.getSource().getId() == StateEnum.UNPAID
                        && transition.getTarget().getId() == StateEnum.WAIT_FOR_RECEIVE) {
                    logger.info("用户完成支付，待收货");
                    return;
                }
                if (transition.getSource().getId() == StateEnum.WAIT_FOR_RECEIVE
                        && transition.getTarget().getId() == StateEnum.DONE) {
                    logger.info("用户已收货，订单完成");
                    return;
                }
            }
        };
    }
}
