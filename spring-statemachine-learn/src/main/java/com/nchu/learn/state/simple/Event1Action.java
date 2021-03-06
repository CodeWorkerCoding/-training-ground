package com.nchu.learn.state.simple;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/4/14 10:15
 */
@Slf4j
@Service
public class Event1Action implements Action<SimpleState, SimpleEvent> {
    @Override
    public void execute(StateContext<SimpleState, SimpleEvent> context) {
        log.info("event 1 action is executing");
        Map variables = context.getExtendedState().getVariables();
        log.info("receive the param: {}", JSON.toJSONString(variables));
        variables.put("E1Time", System.currentTimeMillis());
    }
}
