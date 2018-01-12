package com.nchu.learn.freemark.repo;

import com.nchu.learn.freemark.model.CommonEnity;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/12 18:08
 */
public interface BaseRepo<T, Id> {

    int deleteByPrimaryKey(Id id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Id id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
