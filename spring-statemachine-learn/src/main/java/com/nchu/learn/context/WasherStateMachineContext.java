package com.nchu.learn.context;

import com.nchu.learn.model.enums.WasherEventEunm;
import com.nchu.learn.model.enums.WasherStateEunm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.config.configurers.StateConfigurer;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/12/22 20:59
 */
@Slf4j
public class WasherStateMachineContext {

    private StateMachine<WasherStateEunm, WasherEventEunm> washerStateMachine;

    public WasherStateMachineContext() throws Exception {
        StateMachineBuilder.Builder<WasherStateEunm, WasherEventEunm> builder = StateMachineBuilder.builder();

        builder.configureStates().withStates()
                .initial(WasherStateEunm.RUNNING)
                .state(WasherStateEunm.POWEROFF)
                .end(WasherStateEunm.END)
                .and()
                .withStates()
                .parent(WasherStateEunm.RUNNING)
                .initial(WasherStateEunm.WASHING)
                .state(WasherStateEunm.RINSING)
                .state(WasherStateEunm.DRYING)
                .history(WasherStateEunm.HISTORY, StateConfigurer.History.SHALLOW);


        builder.configureTransitions()
                .withExternal()
                    .source(WasherStateEunm.WASHING).target(WasherStateEunm.RINSING)
                    .event(WasherEventEunm.RINSE)
                    .and()
                .withExternal()
                    .source(WasherStateEunm.RINSING).target(WasherStateEunm.DRYING)
                    .event(WasherEventEunm.DRY)
                    .and()
                .withExternal()
                    .source(WasherStateEunm.RUNNING).target(WasherStateEunm.POWEROFF)
                    .event(WasherEventEunm.CUTPOWER)
                    .and()
                .withExternal()
                    .source(WasherStateEunm.POWEROFF).target(WasherStateEunm.HISTORY)
                    .event(WasherEventEunm.RESTOREPOWER)
                    .and()
                .withExternal()
                    .source(WasherStateEunm.RUNNING).target(WasherStateEunm.END)
                    .event(WasherEventEunm.STOP);

        washerStateMachine = builder.build();
    }
}
