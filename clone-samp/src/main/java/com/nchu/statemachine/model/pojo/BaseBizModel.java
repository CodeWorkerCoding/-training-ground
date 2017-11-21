package com.nchu.statemachine.model.pojo;

import lombok.Data;

/**
 * 基础业务模型表
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 10:25
 */
@Data
public abstract class BaseBizModel extends BaseModel {

    protected String creater;

    protected String updater;
}
