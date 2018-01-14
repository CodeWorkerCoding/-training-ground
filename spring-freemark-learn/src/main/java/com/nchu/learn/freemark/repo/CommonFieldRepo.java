package com.nchu.learn.freemark.repo;

import com.nchu.learn.freemark.model.CommonField;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/12 18:11
 */
@Mapper
public interface CommonFieldRepo extends BaseRepo<CommonField, Integer> {
}
