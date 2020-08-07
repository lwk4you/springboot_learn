package com.lwk4you.springboot_learn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lwk4you.springboot_learn.dao.test2.Test2Dao;
import com.lwk4you.springboot_learn.domain.entity.test2.Test2Entity;
import com.lwk4you.springboot_learn.service.Test2Service;
import org.springframework.stereotype.Service;

@Service
public class Test2ServiceImpl extends ServiceImpl<Test2Dao, Test2Entity> implements Test2Service {
}
