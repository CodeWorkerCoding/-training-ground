package com.nchu.learn.freemark.repo;

import com.nchu.learn.freemark.model.CommonEnity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/12 18:09
 */
@Mapper
public interface CommonEnityRepo extends BaseRepo<CommonEnity, Integer> {

    List<CommonEnity> selectAll();
}
