package com.lwk4you.springboot_learn;
import com.lwk4you.springboot_learn.domain.entity.test2.Test2Entity;
import com.lwk4you.springboot_learn.domain.entity.test1.TestEntity;
import com.lwk4you.springboot_learn.service.Test2Service;
import com.lwk4you.springboot_learn.service.TestService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;


@SpringBootTest
class SpringbootLearnApplicationTests {

    @Autowired
    private TestService testService;
    @Autowired
    private Test2Service test2Service;

    private static Logger logger = LoggerFactory.getLogger(SpringbootLearnApplicationTests.class);

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void testMybatisPlusDataSources() {
        TestEntity testEntity=new TestEntity();
        testEntity.setName("刘伟康");
        testEntity.setAddress("饕餮海");
        testService.save(testEntity);

        System.out.println(testEntity.getId());
        Test2Entity test2Entity=new Test2Entity();
        test2Entity.setSex(1);
        test2Entity.setName("刘伟康");
        test2Entity.setAddress("无故事王国");
        test2Service.save(test2Entity);
        logger.info(test2Entity.getId()+"");

    }

    @Test
    void testRedisTemplate(){

//        stringRedisTemplate.opsForValue().append("key","刘伟康");
        redisTemplate.opsForList().leftPush(1,testService.getById(1));
        redisTemplate.opsForList().leftPush(1,test2Service.getById(1));
    }

    @Test
    void testgeTRedisTemplate(){


       List<TestEntity> list= redisTemplate.opsForList().range(1,0,-1);
        System.out.println(list);
//        redisTemplate.opsForList().leftPush(2,test2Service.getById(1));
    }




}
