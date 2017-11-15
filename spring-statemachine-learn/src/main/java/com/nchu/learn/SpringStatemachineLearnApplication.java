package com.nchu.learn;

import com.nchu.learn.model.enums.EventEnum;
import com.nchu.learn.model.enums.StateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
public class SpringStatemachineLearnApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringStatemachineLearnApplication.class, args);
    }

    @Autowired
    private StateMachine<StateEnum, EventEnum> stateMachine;

    @Override
    public void run(String... args) throws Exception {
        stateMachine.start();
        //stateMachine.sendEvent(EventEnum.PAY);
        //stateMachine.sendEvent(EventEnum.RECEIVE);
    }
}

