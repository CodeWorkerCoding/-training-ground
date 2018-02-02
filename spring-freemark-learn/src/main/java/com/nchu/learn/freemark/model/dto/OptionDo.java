package com.nchu.learn.freemark.model.dto;

import lombok.*;

/**
 * 页面选项元数据模型
 * @author fujianjian
 * @project self-learn
 * @date 2018/2/2 15:34
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OptionDo {

    private String value;

    private String text;
}
