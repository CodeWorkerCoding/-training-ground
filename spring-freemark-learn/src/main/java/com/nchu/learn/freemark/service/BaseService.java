package com.nchu.learn.freemark.service;


/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/12 16:00
 */
public interface BaseService<T, Id> {

    String SYS_NAME = "SYSTEM";

    T findById(Id primaryKey);

    T create(T record);

    T update(T record);

    void deleteById(Id primaryKey);

    void delete(T record);

    //Page<T> findListByPage(Map<String, Object> param, Pageable pageable);


}
