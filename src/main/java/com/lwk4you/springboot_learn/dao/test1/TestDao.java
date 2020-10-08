package com.lwk4you.springboot_learn.dao.test1;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwk4you.springboot_learn.domain.entity.test1.TestEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TestDao extends BaseMapper<TestEntity> {
    @Select("select * from test where id=#{id}")
    TestEntity selectById(@Param("id") Integer id);

}
