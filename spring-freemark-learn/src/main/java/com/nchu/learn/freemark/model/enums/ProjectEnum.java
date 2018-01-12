package com.nchu.learn.freemark.model.enums;

import lombok.Getter;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/12 18:04
 */
@Getter
public enum ProjectEnum {

    SAMP("资产管理平台"),
    FUND("老资金推送系统"),
    SELF_LEARN("练兵场项目"),
    ;

    private String desc;

    ProjectEnum(String desc) {
        this.desc = desc;
    }
}
