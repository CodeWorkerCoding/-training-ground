package com.nchu.learn.freemark.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 统一的实体模型
 *
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/8 15:12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonEnity {

    private String className;

    private String classDesc;

    private String packageName;

    private List<CommonField> fieldList;

}
