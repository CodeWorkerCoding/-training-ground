package com.nchu.statemachine.service.transition;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 12:07
 */
public interface StateTransitionService {

    void handleStateTransition(Object executorParam);
}
