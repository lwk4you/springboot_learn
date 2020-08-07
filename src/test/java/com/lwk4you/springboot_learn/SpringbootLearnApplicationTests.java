package com.lwk4you.springboot_learn;
import com.lwk4you.springboot_learn.domain.entity.test2.Test2Entity;
import com.lwk4you.springboot_learn.domain.entity.test1.TestEntity;
import com.lwk4you.springboot_learn.service.Test2Service;
import com.lwk4you.springboot_learn.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootLearnApplicationTests {

    @Autowired
    private TestService testService;
    @Autowired
    private Test2Service test2Service;

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
        System.out.println(test2Entity.getId());

    }

}
