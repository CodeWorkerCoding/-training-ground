package com.nchu.statemachine.model.enums;

import lombok.Getter;

/**
 * 状态机状态配置
 *
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 10:20
 */
@Getter
public enum MachineStateEunm {
    INIT("ROOT", "初始化状态"),

    //Wash Machine States;
    DIRTY("DIRTY", "加待洗衣物"),
    WET("WET", "打湿衣物"),
    CLEAN("CLEAN", "干净衣物"),
    DRYING("DRYING", "烘干衣物"),
    //End

    DONE("END", "最终状态"),

    ;

    private String state;

    private String desc;

    MachineStateEunm(String state, String desc) {
        this.state = state;
        this.desc = desc;
    }
}

