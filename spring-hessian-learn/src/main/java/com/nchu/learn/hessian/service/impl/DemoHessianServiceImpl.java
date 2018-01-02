package com.nchu.learn.hessian.service.impl;

import com.nchu.learn.hessian.service.DemoHessianService;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/2 17:23
 */
public class DemoHessianServiceImpl implements DemoHessianService {

    @Override
    public String sayHello(String userName) {
        return "hello world" + userName;
    }
}
