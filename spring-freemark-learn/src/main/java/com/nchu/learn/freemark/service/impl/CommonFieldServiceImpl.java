package com.nchu.learn.freemark.service.impl;

import com.nchu.learn.freemark.middle.UserContext;
import com.nchu.learn.freemark.model.CommonField;
import com.nchu.learn.freemark.repo.CommonFieldRepo;
import com.nchu.learn.freemark.service.CommonFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/12 18:14
 */
@Service
public class CommonFieldServiceImpl implements CommonFieldService {

    @Autowired
    private CommonFieldRepo commonFieldRepo;

    @Override
    public CommonField findById(Integer primaryKey) {
        return this.commonFieldRepo.selectByPrimaryKey(primaryKey);
    }

    @Override
    public CommonField create(CommonField record) {
        record.setCreatedTime(System.currentTimeMillis());
        record.setCreater(UserContext.getUserName() == null ? SYS_NAME : UserContext.getUserName());
        this.commonFieldRepo.insertSelective(record);
        return record;
    }

    @Override
    public CommonField update(CommonField record) {
        record.setModifiedTime(System.currentTimeMillis());
        record.setUpdater(UserContext.getUserName() == null ? SYS_NAME : UserContext.getUserName());
        this.commonFieldRepo.updateByPrimaryKeySelective(record);
        return null;
    }

    @Override
    public void deleteById(Integer primaryKey) {
        this.commonFieldRepo.deleteByPrimaryKey(primaryKey);
    }

    @Override
    public void delete(CommonField record) {
        this.commonFieldRepo.deleteByPrimaryKey(record.getId());
    }
}
