package com.nchu.learn.freemark.service;

import com.nchu.learn.freemark.model.CommonEnity;

import java.util.List;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/12 18:01
 */
public interface CommonEnityService extends BaseService<CommonEnity, Integer> {

    List<CommonEnity> findAllList();

}
