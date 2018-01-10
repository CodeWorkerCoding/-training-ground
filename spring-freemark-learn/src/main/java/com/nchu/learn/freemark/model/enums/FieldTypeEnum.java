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
