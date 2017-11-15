package com.nchu.learn.model.annotation;

import com.nchu.learn.model.enums.StateEnum;
import org.springframework.statemachine.annotation.OnStateChanged;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义OnStateChange增强
 *
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/15 18:27
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@OnStateChanged
public @interface StatesOnStates {

    StateEnum[] source() default {};

    StateEnum[] target() default {};
}
