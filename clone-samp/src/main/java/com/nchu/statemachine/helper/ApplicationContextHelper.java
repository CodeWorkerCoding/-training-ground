package com.nchu.statemachine.helper;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * spring 上下文工具类
 *
 * @author fujianjian
 * @project self-learn
 * @date 2017/12/22 14:18
 */
@Component
public class ApplicationContextHelper implements ApplicationContextAware {

    private static ApplicationContext applicationContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext = applicationContext;
    }

    public static Object getBean(String beanName) {
        Object object = null;
        if (isContainsBean(beanName)) {
            object = applicationContext.getBean(beanName);
        }
        return object;
    }

    public static boolean isContainsBean(String beanName) {
        return applicationContext.containsBean(beanName);
    }
}
