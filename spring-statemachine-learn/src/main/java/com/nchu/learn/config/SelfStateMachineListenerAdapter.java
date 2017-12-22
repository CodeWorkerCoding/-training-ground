package com.nchu.learn.config;

import com.nchu.learn.model.enums.EventEnum;
import com.nchu.learn.model.enums.StateEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.state.State;

/**
 * 状态机监听器
 *
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/15 17:43
 */
@Slf4j
//@Configuration
public class SelfStateMachineListenerAdapter extends StateMachineListenerAdapter<StateEnum, EventEnum> {

    //@Override
    //public void stateChanged(State<StateEnum, EventEnum> from, State<StateEnum, EventEnum> to) {
    //    log.info("machine state is changed, from state [{}] and aim state [{}]", from.getId(), to.getId());
    //}


    /**
     *  sendEvent() 方法驱动不了
     * @param key
     * @param value
     */
    @Override
    public void extendedStateChanged(Object key, Object value) {
        super.extendedStateChanged(key, value);
        log.info("machine extend state changed the key [{}] value [{}]", key, value);
    }
}
