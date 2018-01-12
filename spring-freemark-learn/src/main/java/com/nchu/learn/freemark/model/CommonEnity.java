package com.nchu.learn.freemark.model;

import com.nchu.learn.freemark.model.enums.ProjectEnum;
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
@NoArgsConstructor
@AllArgsConstructor
public class CommonEnity extends  BaseEnity {

    private String className;

    private String classDesc;

    private ProjectEnum projectName;

    private String packageName;

    private List<CommonField> fieldList;

}
