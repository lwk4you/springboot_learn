package com.lwk4you.springboot_learn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwk4you.springboot_learn.dao.test1.TestDao;
import com.lwk4you.springboot_learn.domain.entity.test1.TestEntity;
import com.lwk4you.springboot_learn.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<TestDao, TestEntity> implements TestService {


}
