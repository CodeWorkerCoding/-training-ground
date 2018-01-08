package com.nchu.learn.freemark.model.enums;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/8 15:43
 */
public enum NecessaryEnum {
    MUST("必填"),
    MAYBE("选填"),
    ;

    private String desc;

    NecessaryEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
