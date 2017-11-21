package com.nchu.statemachine.repo;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 10:52
 */
public interface BaseRepository<T extends Object, ID extends String> {

    int deleteByPrimaryKey(ID primaryKey);

    int insertObject(T t);

    T findByPrimaryKey(ID primary);
}
