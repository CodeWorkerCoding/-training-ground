package com.nchu.learn.interceptor;

import com.alibaba.fastjson.JSON;
import com.nchu.learn.model.enums.EventEnum;
import com.nchu.learn.model.enums.StateEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.support.StateMachineInterceptor;
import org.springframework.statemachine.support.StateMachineInterceptorAdapter;
import org.springframework.statemachine.transition.Transition;
import org.springframework.stereotype.Component;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/12/22 17:11
 */
@Slf4j
@Component
public class CustomStateMachineIntercepor implements StateMachineInterceptor<StateEnum, EventEnum> {
    @Override
    public Message<EventEnum> preEvent(Message<EventEnum> message, StateMachine<StateEnum, EventEnum> stateMachine) {
        return null;
    }

    @Override
    public void preStateChange(State<StateEnum, EventEnum> state, Message<EventEnum> message, Transition<StateEnum, EventEnum> transition, StateMachine<StateEnum, EventEnum> stateMachine) {
        log.info("=====> state [{}]", state.getId());
        log.info("=====> message [{}]", JSON.toJSONString(message));
        log.info("=====> transition [{}]", JSON.toJSONString(transition));
        log.info("=====> statemachine [{}]", JSON.toJSON(stateMachine));
    }

    @Override
    public void postStateChange(State<StateEnum, EventEnum> state, Message<EventEnum> message, Transition<StateEnum, EventEnum> transition, StateMachine<StateEnum, EventEnum> stateMachine) {

    }

    @Override
    public StateContext<StateEnum, EventEnum> preTransition(StateContext<StateEnum, EventEnum> stateContext) {
        return stateContext;
    }

    @Override
    public StateContext<StateEnum, EventEnum> postTransition(StateContext<StateEnum, EventEnum> stateContext) {
        return stateContext;
    }

    @Override
    public Exception stateMachineError(StateMachine<StateEnum, EventEnum> stateMachine, Exception exception) {
        log.info("=========================[StateMachine Run Error]===========================");
        log.error("the runtime error", exception);
        State<StateEnum, EventEnum> state = stateMachine.getState();
        log.info(" current state is [{}]", state.getId());
        log.info("=========================[StateMachine Run Error]===========================");
        return null;
    }
}
