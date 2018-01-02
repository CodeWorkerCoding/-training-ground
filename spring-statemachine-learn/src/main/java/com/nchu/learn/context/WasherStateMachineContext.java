package com.nchu.learn.context;

import com.alibaba.fastjson.JSON;
import com.nchu.learn.model.enums.WasherEventEunm;
import com.nchu.learn.model.enums.WasherStateEunm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.StaticListableBeanFactory;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.action.Action;
import org.springframework.statemachine.action.ActionListener;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.config.configurers.StateConfigurer;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/12/22 20:59
 */
@Slf4j
public class WasherStateMachineContext {

    private static StateMachine<WasherStateEunm, WasherEventEunm> washerStateMachine;

    public WasherStateMachineContext() throws Exception {
        StateMachineBuilder.Builder<WasherStateEunm, WasherEventEunm> builder = StateMachineBuilder.builder();

        builder.configureConfiguration().withConfiguration().beanFactory(new StaticListableBeanFactory());

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
                    .action(new RinseEventAction())
                    .and()
                .withExternal()
                    .source(WasherStateEunm.RINSING).target(WasherStateEunm.DRYING)
                    .event(WasherEventEunm.DRY)
                    .action(new Action<WasherStateEunm, WasherEventEunm>() {
                        @Override
                        public void execute(StateContext<WasherStateEunm, WasherEventEunm> context) {
                            log.info("execute DRY Action");
                        }
                    })
                    .and()
                .withExternal()
                    .source(WasherStateEunm.RUNNING).target(WasherStateEunm.POWEROFF)
                    .event(WasherEventEunm.CUTPOWER)
                    .action(new Action<WasherStateEunm, WasherEventEunm>() {
                        @Override
                        public void execute(StateContext<WasherStateEunm, WasherEventEunm> context) {
                            log.info("execute CUTPOWER Action");
                        }
                    })
                    .and()
                .withExternal()
                    .source(WasherStateEunm.POWEROFF).target(WasherStateEunm.HISTORY)
                    .event(WasherEventEunm.RESTOREPOWER)
                    .action(new Action<WasherStateEunm, WasherEventEunm>() {
                        @Override
                        public void execute(StateContext<WasherStateEunm, WasherEventEunm> context) {
                            log.info("execute RESTOREPOWER Action");
                        }
                    })
                    .and()
                .withExternal()
                    .source(WasherStateEunm.RUNNING).target(WasherStateEunm.END)
                    .event(WasherEventEunm.STOP)
                    .action(new Action<WasherStateEunm, WasherEventEunm>() {
                        @Override
                        public void execute(StateContext<WasherStateEunm, WasherEventEunm> context) {
                            log.info("execute Stop Action");
                        }
                    });


        washerStateMachine = builder.build();
    }


    public static StateMachine<WasherStateEunm, WasherEventEunm> getWashStateMachineInstance() throws Exception {
        if (washerStateMachine == null) {
            new WasherStateMachineContext();
        }
        return washerStateMachine;
    }


    private class RinseEventAction implements Action<WasherStateEunm, WasherEventEunm> {

        @Override
        public void execute(StateContext<WasherStateEunm, WasherEventEunm> context) {
            log.info("execute on Washer Rinse action");
            log.info("stateContext ====>{}", JSON.toJSONString(context));
        }
    }

}
