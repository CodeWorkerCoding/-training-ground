package com.nchu.learn.config;

import com.nchu.learn.interceptor.CustomStateMachineIntercepor;
import com.nchu.learn.model.enums.EventEnum;
import com.nchu.learn.model.enums.StateEnum;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.StaticListableBeanFactory;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.config.model.StateData;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.support.StateMachineInterceptorAdapter;
import org.springframework.stereotype.Component;

import java.util.EnumSet;

/**
 * 状态机自定义配置
 *
 * @author fujianjian
 * @project self-learn
 * @date 2017/12/22 15:14
 */
@Component
public class CustomStateMachineConfig implements InitializingBean {

    private final static StateData<StateEnum, EventEnum> initState = new StateData<StateEnum, EventEnum>(StateEnum.INIT, true);
    private final static StateData<StateEnum, EventEnum> endState = new StateData<StateEnum, EventEnum>(StateEnum.END);

    private static StateMachine<StateEnum, EventEnum> stateMachine;

    @Autowired
    private CustomStateMachineIntercepor customStateMachineIntercepor;

    @Override
    public void afterPropertiesSet() throws Exception {

        //状态机创建器
        StateMachineBuilder.Builder<StateEnum, EventEnum> builder = StateMachineBuilder.builder();

        builder.configureConfiguration().withConfiguration().beanFactory(new StaticListableBeanFactory())
                .listener(new SelfStateMachineListenerAdapter());

        builder.configureTransitions().withExternal().source(StateEnum.UNPAID).target(StateEnum.WAIT_FOR_RECEIVE).event(EventEnum.PAY)
                .and()
                .withExternal().source(StateEnum.WAIT_FOR_RECEIVE).target(StateEnum.DONE).event(EventEnum.RECEIVE);

        builder.configureStates().withStates()
                .initial(initState.getState())
                .state(StateEnum.UNPAID)
                .end(endState.getState())
                .states(EnumSet.allOf(StateEnum.class));

        stateMachine = builder.build();

        //postInit();
        //stateMachine.start();
    }

    private void postInit() {
        stateMachine.getStateMachineAccessor().doWithAllRegions(accessor -> {
            accessor.addStateMachineInterceptor(customStateMachineIntercepor);
        });
    }

    public static StateMachine<StateEnum, EventEnum> getStateMachine() {
        return stateMachine;
    }
}
