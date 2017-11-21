package com.nchu.statemachine.model.enums;

import lombok.Getter;

/**
 * 状态机事件枚举
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 10:23
 */
@Getter
public enum MachineEventEnum {

    // Wash Machine Event
    SUBMIT_WASH("SUBMIT_WASH", "提交任务"),
    PRE_WASH("PRE_WASH", "洗衣之前"),
    WASHING("WASHING", "洗涤"),
    DRY("DRY", "烘干"),
    POST_WASH("POST_WASH", "洗涤后续"),

    //End
    ;

    private String eventName;

    private String desc;

    MachineEventEnum(String eventName, String desc) {
        this.eventName = eventName;
        this.desc = desc;
    }
}
