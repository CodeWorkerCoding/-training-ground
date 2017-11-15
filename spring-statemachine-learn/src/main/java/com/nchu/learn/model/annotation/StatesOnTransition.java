package com.nchu.learn.model.annotation;

import com.nchu.learn.model.enums.StateEnum;
import org.springframework.statemachine.annotation.OnTransition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义增强OnTransition注解
 *
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/15 18:19
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@OnTransition
public @interface StatesOnTransition {

    StateEnum[] source() default {};

    StateEnum[] target() default {};

}
