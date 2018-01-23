package com.nchu.learn.context;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.StaticListableBeanFactory;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.action.Action;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.guard.Guard;
import org.springframework.statemachine.test.StateMachineTestPlan;
import org.springframework.statemachine.test.StateMachineTestPlanBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/18 14:17
 */
@Slf4j
public class ValidateStateMachineContext {

    private ValidateAction validateAction;
    public StateMachine<String, String> buildValidateStateMachine() throws Exception {

        StateMachineBuilder.Builder<String, String> builder = StateMachineBuilder.builder();
        builder.configureConfiguration()
                .withConfiguration()
                .beanFactory(new StaticListableBeanFactory())
                .taskExecutor(new SyncTaskExecutor())
                .autoStartup(true);

        builder.configureStates()
                .withStates()
                .initial("A")
                .end("D")
                //.states(Sets.newHashSet("A", "B", "B1", "B2", "B3", "C", "C1", "C2", "D"))
                .states(Sets.newHashSet("A", "B", "C", "D"));
                //.and().withStates()
                //.parent("B")
                //.initial("B1")
                //.states(Sets.newHashSet("B1", "B2", "B3"))
                //.and().withStates()
                //.parent("C")
                //.initial("C1")
                //.state("C2");

        builder.configureTransitions()
                .withExternal()
                .source("A").target("B").event("E1").action(new Action<String, String>() {
            @Override
            public void execute(StateContext<String, String> context) {
                log.info("\n\nTest Action on Event transition\n");
                MessageHeaders messageHeaders = context.getMessageHeaders();
                Object object = messageHeaders.get("param");
                log.info("action param:{}\n", JSON.toJSONString(object));
            }
        }).guard(new Guard<String, String>() {
            @Override
            public boolean evaluate(StateContext<String, String> context) {
                log.info("\n\nexecuting guard function!!!\n");
                return true;
            }
        })
                .and().withExternal()
                .source("B").target("C").event("E2").action(validateAction)
                .and().withExternal()
                .source("C").target("D").event("E3").action(validateAction);
        return builder.build();
    }

    public static void main(String[] args) throws Exception {
        ValidateStateMachineContext validateStateMachineContext = new ValidateStateMachineContext();
        validateStateMachineContext.validateAction = new ValidateStateMachineContext.ValidateAction();
        StateMachine<String, String> stateMachine = validateStateMachineContext.buildValidateStateMachine();
        Map<String, Object> test = new HashMap<>();
        test.put("name", "testMachine");
        test.put("age", 123434);
        StateMachineTestPlan<String, String> testPlan = StateMachineTestPlanBuilder.<String, String>builder()
                .defaultAwaitTime(1)
                .stateMachine(stateMachine)
                .step()
                .expectStates("A")
                .and()
                .step().sendEvent(MessageBuilder.withPayload("E1").setHeader("param", test).build())
                //.expectStateChanged(1)
                .expectStates("B")
                .and()
                .step().sendEvent(MessageBuilder.withPayload("E2").setHeader("param", test).build())
                //.expectStateChanged(1)
                .expectStates("C")
                .and()
                .step().sendEvent(MessageBuilder.withPayload("E3").setHeader("param", test).build())
                //.expectStateChanged(1)
                .expectStates("D")
                .expectStateMachineStopped(1)
                .and()
                .build();

        testPlan.test();
    }

    public static class ValidateAction implements Action<String, String> {

        @Override
        public void execute(StateContext<String, String> context) {
            log.info("source state: {}", context.getSource().getId());
            log.info("target state: {}", context.getTarget().getId());
            log.info("send event: {}", context.getEvent());
            log.info("transition param: {}", JSON.toJSONString(context.getMessageHeaders().get("param")));
        }
    }

}
