package com.nchu.learn.freemark.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.nchu.learn.freemark.model.enums.FieldTypeEnum;
import com.nchu.learn.freemark.model.enums.NecessaryEnum;
import lombok.Builder;
import lombok.Data;

/**
 * 统一字段模型
 *
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/8 15:16
 */
@Data
@Builder
public class CommonField {

    private String fieldName;

    private String fieldDesc;

    private FieldTypeEnum fieldType;

    private NecessaryEnum necessary;
}
