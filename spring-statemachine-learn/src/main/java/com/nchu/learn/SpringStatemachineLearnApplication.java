package com.nchu.learn;

import com.nchu.learn.aware.JianjianBeanNameService;
import com.nchu.learn.config.CustomStateMachineConfig;
import com.nchu.learn.context.WasherStateMachineContext;
import com.nchu.learn.model.enums.EventEnum;
import com.nchu.learn.model.enums.StateEnum;
import com.nchu.learn.model.enums.WasherEventEunm;
import com.nchu.learn.model.enums.WasherStateEunm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

import java.util.concurrent.TimeUnit;

@Slf4j
@SpringBootApplication
public class SpringStatemachineLearnApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringStatemachineLearnApplication.class, args);
    }

    //@Autowired
    //private StateMachine<StateEnum, EventEnum> stateMachine;

    @Override
    public void run(String... args) throws Exception {

        //StateMachine<StateEnum, EventEnum> stateMachine = CustomStateMachineConfig.getStateMachine();

        //log.info("stateMachine name: {}", stateMachine.getClass().getCanonicalName());

        //System.out.println(jianjianBeanNameService.getBeanName());
        //stateMachine.start();
        //stateMachine.sendEvent(EventEnum.PAY);
        //stateMachine.sendEvent(EventEnum.RECEIVE);

        StateMachine<WasherStateEunm, WasherEventEunm> washStateMachineInstance = WasherStateMachineContext.getWashStateMachineInstance();

        washStateMachineInstance.start();
        washStateMachineInstance.sendEvent(WasherEventEunm.RINSE);
        TimeUnit.SECONDS.sleep(1L);
        washStateMachineInstance.sendEvent(WasherEventEunm.DRY);
        TimeUnit.SECONDS.sleep(1L);
        washStateMachineInstance.sendEvent(WasherEventEunm.CUTPOWER);
        TimeUnit.SECONDS.sleep(1L);
        washStateMachineInstance.sendEvent(WasherEventEunm.RESTOREPOWER);
        TimeUnit.SECONDS.sleep(1L);
        washStateMachineInstance.sendEvent(WasherEventEunm.STOP);
        TimeUnit.SECONDS.sleep(1L);
        washStateMachineInstance.start();

    }
}

