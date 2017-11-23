package com.nchu.learn.aware;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/22 18:24
 */
@Service
@Data
public class JianjianBeanNameService implements BeanNameAware, ApplicationContextAware {

    private String beanName;

    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
