package com.lwk4you.springboot_learn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwk4you.springboot_learn.dao.test1.TestDao;
import com.lwk4you.springboot_learn.domain.entity.test1.TestEntity;
import com.lwk4you.springboot_learn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class TestServiceImpl extends ServiceImpl<TestDao, TestEntity> implements TestService {
    @Autowired
    private TestDao testDao;

    @Cacheable(cacheNames = "test")
    public TestEntity getTestById(Integer id) {
        return getById(id);
    }

    @Override
    @Cacheable(cacheNames = "test")
    public TestEntity getTestById2(Integer id) {
        return testDao.selectById(id);
    }

}
