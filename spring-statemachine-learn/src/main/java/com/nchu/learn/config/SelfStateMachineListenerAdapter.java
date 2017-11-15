package com.nchu.learn.config;

import com.nchu.learn.model.enums.EventEnum;
import com.nchu.learn.model.enums.StateEnum;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;

/**
 * 状态机监听器
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/15 17:43
 */
@Configuration
public class SelfStateMachineListenerAdapter extends StateMachineListenerAdapter<StateEnum, EventEnum> {
}
