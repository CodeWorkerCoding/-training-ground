package com.nchu.statemachine.service;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 10:45
 */
public interface BaseService<T extends Object, ID extends String> {

    T findById(ID id);

    T save(T t);

    T update(T t);

    void deleteEnity(T t);

    void deleteById(ID id);
}
