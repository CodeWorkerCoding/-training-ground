package com.nchu.learn.freemark.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/5 17:44
 */
@Data
@Builder
public class FieldDo {

    private String fieldName;

    private String fieldType;

    private String fieldComment;

    private String need;

}
