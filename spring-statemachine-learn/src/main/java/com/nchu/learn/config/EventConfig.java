package com.nchu.learn.config;

import com.nchu.learn.model.enums.StateEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.annotation.OnStateChanged;
import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;
import org.springframework.statemachine.transition.Transition;

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
    public void create() {
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

    @OnStateChanged
    public void onChange() {
        //logger.info("状态发生改变了, source: [{}], target:[{}]", transition.getSource(), transition.getTarget());
        logger.info("状态发生改变了");
    }
}
