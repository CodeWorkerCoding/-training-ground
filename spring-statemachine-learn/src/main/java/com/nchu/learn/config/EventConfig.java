package com.nchu.learn.config;

import com.nchu.learn.model.annotation.EventOnNotAccepted;
import com.nchu.learn.model.annotation.StatesOnStates;
import com.nchu.learn.model.annotation.StatesOnTransition;
import com.nchu.learn.model.enums.EventEnum;
import com.nchu.learn.model.enums.StateEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.annotation.*;
import org.springframework.statemachine.transition.Transition;

import static com.nchu.learn.model.enums.EventEnum.PAY;
import static com.nchu.learn.model.enums.StateEnum.DONE;
import static com.nchu.learn.model.enums.StateEnum.UNPAID;

/**
 * 事件配置
 *
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/15 16:55
 */
@WithStateMachine
public class EventConfig {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @OnTransition(target = "UNPAID")
    public void create(StateContext StateContext) {
        logger.info("订单创建，待支付");
    }

    @OnTransition(target = "WAIT_FOR_RECEIVE")
    public void pay() {
        logger.info("用户完成支付，待收货");
    }

    @OnTransition(target = "DONE")
    public void receive() {
        logger.info("用户已收货，订单完成");
    }

    @StatesOnTransition(target = DONE)
    public void receive2() {
        logger.info("用户已收货，订单完成---2222222222222222222");
    }

    @OnStateChanged
    public void onChange() {
        //logger.info("状态发生改变了, source: [{}], target:[{}]", transition.getSource(), transition.getTarget());
        logger.info("状态发生改变了");
    }

    @StatesOnStates(source = UNPAID)
    public void onChange2() {
        //logger.info("状态发生改变了, source: [{}], target:[{}]", transition.getSource(), transition.getTarget());
        logger.info("状态发生改变了---222222222222");
    }

    @OnTransition
    public void anyTransition(StateContext<StateEnum, EventEnum> stateContext) {
        logger.info("状态发生改变了, source: [{}], target:[{}]", stateContext.getSource(), stateContext.getTarget());
    }

    @EventOnNotAccepted(event = PAY)
    public void anyEventRejected() {
        logger.info("事件不被接受---------------111111111111111");
    }

    @OnStateMachineStart
    public void start() {
        logger.info("state machine is started");
    }

    @OnStateMachineStop
    public void stop() {
        logger.info("state machine is Stoped");
    }
}
