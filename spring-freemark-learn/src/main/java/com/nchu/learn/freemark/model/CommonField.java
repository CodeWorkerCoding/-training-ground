package com.nchu.learn.freemark.model;

import com.nchu.learn.freemark.model.enums.FieldTypeEnum;
import com.nchu.learn.freemark.model.enums.NecessaryEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一字段模型
 *
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/8 15:16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonField extends BaseEnity {

    private Integer classId;

    private String fieldName;

    private String fieldDesc;

    private FieldTypeEnum fieldType;

    private NecessaryEnum necessary;
}
