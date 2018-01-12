package com.nchu.learn.freemark.model;

import lombok.Data;

import java.util.Date;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/12 18:02
 */
@Data
public abstract class BaseEnity {

    private Integer id;

    private Date createdTime;

    private Date modifiedTime;

    private String creater;

    private String updater;
}
