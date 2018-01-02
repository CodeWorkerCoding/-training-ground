package com.nchu.learn.freemark.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/2 18:50
 */
@Data
@Builder
public class DemoDo {
    private String name;
    private Integer age;
}
