package com.nchu.statemachine.service.impl.transition;

import com.nchu.statemachine.service.transition.WashMachineStateTransitionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 12:11
 */
@Slf4j
@Service("washMachineStateTransitionService")
public class WashMachineStateTransitionServiceImpl implements WashMachineStateTransitionService {
    @Override
    public void handleStateTransition(Object executorParam) {
        log.info("this is Wash Machine states handle");
    }


    public void submitWash(Object executeParam) {

    }

    public void pourWater(Object executeParam) {

    }

    public void washColthes(Object executeParam) {

    }

    public void dryColthes(Object executeParam) {

    }

    public void airColthes(Object executeParam) {

    }
}
