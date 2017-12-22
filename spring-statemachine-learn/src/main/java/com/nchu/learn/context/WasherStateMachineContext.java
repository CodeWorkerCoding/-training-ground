package com.nchu.learn.context;

import com.nchu.learn.model.enums.WasherEventEunm;
import com.nchu.learn.model.enums.WasherStateEunm;
import org.springframework.statemachine.StateMachine;
import org.springframework.stereotype.Component;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/12/22 20:59
 */
@Component
public class WasherStateMachineContext {

    private StateMachine<WasherStateEunm, WasherEventEunm> washerStateMachine;



}
