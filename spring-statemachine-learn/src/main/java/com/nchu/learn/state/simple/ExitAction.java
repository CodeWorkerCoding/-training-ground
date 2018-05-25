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
 * @date 2018/4/18 17:30
 */
@Slf4j
@Service
public class ExitAction implements Action<SimpleState, SimpleEvent> {

    @Override
    public void execute(StateContext<SimpleState, SimpleEvent> context) {
        log.info("exit action is executing");
        Map<Object, Object> varible = context.getExtendedState().getVariables();
        log.info("the action param: {}", JSON.toJSONString(varible));
    }
}
