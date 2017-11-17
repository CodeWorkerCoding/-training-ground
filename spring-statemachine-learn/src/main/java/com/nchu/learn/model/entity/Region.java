package com.nchu.learn.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/17 14:32
 */
@Data
@Builder
public class Region {
    private String id;

    private Integer code;

    private String name;
}
