package com.nchu.learn.model.annotation;

import com.nchu.learn.model.enums.EventEnum;
import org.springframework.statemachine.annotation.OnEventNotAccepted;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义d
 *
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/15 18:35
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@OnEventNotAccepted
public @interface EventOnNotAccepted {
    EventEnum[] event() default {};


}
