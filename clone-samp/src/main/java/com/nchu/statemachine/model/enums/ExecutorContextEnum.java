package com.nchu.statemachine.model.enums;

import lombok.Getter;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 13:54
 */
@Getter
public enum ExecutorContextEnum {

    // Wash Machine Context
    SUBMIT_WASH_EXECUTE("washMachineStateTransitionService", "submitWash", ""),
    PRE_WASH_EXECUTE("washMachineStateTransitionService", "pourWater", ""),
    WASHING_EXECUTE("washMachineStateTransitionService", "washColthes", ""),
    DRY_EXECUTE("washMachineStateTransitionService", "dryColthes", ""),
    POST_WASH_EXECUTE("washMachineStateTransitionService", "airColthes", ""),
    //End


    ;
    private String executorContext;

    private String executorMethod;

    private String desc;

    ExecutorContextEnum(String executorContext, String executorMethod, String desc) {
        this.executorContext = executorContext;
        this.executorMethod = executorMethod;
        this.desc = desc;
    }
}
