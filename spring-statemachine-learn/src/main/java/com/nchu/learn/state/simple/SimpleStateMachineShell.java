package com.nchu.learn.state.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.statemachine.StateMachine;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/4/18 16:47
 */
@ShellComponent
public class SimpleStateMachineShell {

    @Autowired
    private StateMachine<SimpleState, SimpleEvent> simpleStateMachine;

    @ShellMethod(value = "start the state machine", key = "start machine")
    public void startMachine() {
        this.simpleStateMachine.start();
    }


    @ShellMethod(value = "stop the state machine", key = "stop machine")
    public void stopMachine() {
        this.simpleStateMachine.stop();
    }

    @ShellMethod(value = "send event to machine", key = "send event")
    public void sendEvent(SimpleEvent simpleEvent) {
        this.simpleStateMachine.sendEvent(simpleEvent);
    }
}
