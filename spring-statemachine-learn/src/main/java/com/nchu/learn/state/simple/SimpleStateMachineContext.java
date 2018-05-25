package com.nchu.learn.state.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.StaticListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;

import java.util.EnumSet;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/4/12 19:14
 */
@Configuration
public class SimpleStateMachineContext {

    @Autowired
    private Event1Action event1Action;

    @Autowired
    private Event2Action event2Action;

    @Autowired
    private EntryAction entryAction;

    @Autowired
    private ExitAction exitAction;

    @Bean
    public StateMachine<SimpleState, SimpleEvent> simpleStateMachine() throws Exception {
        StateMachineBuilder.Builder<SimpleState, SimpleEvent> stateMachineBuilder = StateMachineBuilder.builder();

        stateMachineBuilder.configureConfiguration().withConfiguration().beanFactory(new StaticListableBeanFactory());

        stateMachineBuilder.configureStates().withStates().initial(SimpleState.ROOT)
                .end(SimpleState.END).states(EnumSet.allOf(SimpleState.class));

        stateMachineBuilder.configureTransitions().withExternal().source(SimpleState.ROOT).target(SimpleState.S1).event(SimpleEvent.ENTRY).action(entryAction)
                .and().withExternal().source(SimpleState.S1).target(SimpleState.S2).event(SimpleEvent.E1).action(event1Action).timer(1000L)
                .and().withExternal().source(SimpleState.S2).target(SimpleState.S3).event(SimpleEvent.E2).action(event2Action)
                .and().withExternal().source(SimpleState.S3).target(SimpleState.END).event(SimpleEvent.EXIT).action(exitAction);

        StateMachine<SimpleState, SimpleEvent> stateMachine = stateMachineBuilder.build();
        return stateMachine;
    }

}
