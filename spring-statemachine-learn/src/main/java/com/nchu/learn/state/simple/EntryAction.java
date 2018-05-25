package com.nchu.learn.state.simple;

import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/4/18 17:14
 */
@Slf4j
@Service
public class EntryAction implements Action<SimpleState, SimpleEvent> {

    @Override
    public void execute(StateContext<SimpleState, SimpleEvent> context) {
        log.info("entry action was executing");
        log.info("init action context param!");
        Map variable = ImmutableMap.of("name", "123443", "age", 10,
                "addr", "上海");
        context.getExtendedState().getVariables().putAll(variable);
        log.info("completed init data ending");
    }
}
