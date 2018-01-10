package com.nchu.learn.freemark.model.enums;

import lombok.Getter;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/8 15:36
 */
@Getter
public enum FieldTypeEnum {

    STRING("String", "java.lang.String", false),
    INTEGER("Integer", "java.lang.Integer", false),
    DOUBLE("Double", "java.lang.Double", false),
    LONG("Long", "java.lang.Long", false),
    BYTE("Byte", "java.lang.Byte", false),
    FLOAT("Float", "java.lang.Float", false),
    BOOLEAN("Boolean", "java.lang.Boolean", false),
    BIGDECIMAL("BigDecimal", "java.lang.Boolean", true),

    ;

    private String appearType;

    private String packagePath;

    private Boolean needImport;


    FieldTypeEnum(String appearType, String packagePath, Boolean needImport) {
        this.appearType = appearType;
        this.packagePath = packagePath;
        this.needImport = needImport;
    }
}
