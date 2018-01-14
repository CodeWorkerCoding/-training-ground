package com.nchu.learn.freemark.service.impl;

import com.nchu.learn.freemark.middle.UserContext;
import com.nchu.learn.freemark.model.CommonEnity;
import com.nchu.learn.freemark.repo.CommonEnityRepo;
import com.nchu.learn.freemark.service.CommonEnityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/12 18:15
 */
@Service
public class CommonEnityServiceImpl implements CommonEnityService {

    @Autowired
    private CommonEnityRepo commonEnityRepo;

    @Override
    public CommonEnity findById(Integer primaryKey) {
        return this.commonEnityRepo.selectByPrimaryKey(primaryKey);
    }

    @Override
    public CommonEnity create(CommonEnity record) {
        record.setCreatedTime(System.currentTimeMillis());
        if (UserContext.getUserName() == null) {
            record.setCreater(SYS_NAME);
        } else {
            record.setCreater(UserContext.getUserName());
        }
        this.commonEnityRepo.insertSelective(record);
        return record;
    }

    @Override
    public CommonEnity update(CommonEnity record) {
        return null;
    }

    @Override
    public void deleteById(Integer primaryKey) {
        this.commonEnityRepo.deleteByPrimaryKey(primaryKey);
    }

    @Override
    public void delete(CommonEnity record) {
        this.commonEnityRepo.deleteByPrimaryKey(record.getId());
    }

    @Override
    public List<CommonEnity> findAllList() {
        return commonEnityRepo.selectAll();
    }
}
