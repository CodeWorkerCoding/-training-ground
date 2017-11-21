package com.nchu.statemachine.model.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 基础模型
 *
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 10:16
 */
@Data
public abstract class BaseModel {
    protected String id;

    protected Date createdTime;

    protected Date modifiedTime;

}
