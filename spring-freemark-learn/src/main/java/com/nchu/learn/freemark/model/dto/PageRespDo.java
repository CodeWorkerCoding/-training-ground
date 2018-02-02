package com.nchu.learn.freemark.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 页面统一响应模型类
 * Created by fujianjian on 2018/1/23.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageRespDo {

    /**
     * 处理结果
     */
    private Integer code;

    /**
     * 描述信息
     */
    private String msg;

    /**
     * 条数
     */
    private Integer count;

    /**
     * 数据
     */
    private Object data;

}
