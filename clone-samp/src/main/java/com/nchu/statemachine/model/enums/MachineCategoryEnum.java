package com.nchu.statemachine.model.enums;

import lombok.Getter;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 13:23
 */
@Getter
public enum MachineCategoryEnum {

    WASH_MACHINE("WASH_MACHINE", "洗衣机状态"),

    ;

    private String category;

    private String desc;

    MachineCategoryEnum(String category, String desc) {
        this.category = category;
        this.desc = desc;
    }
}
