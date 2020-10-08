package com.lwk4you.springboot_learn.controller;

import com.lwk4you.springboot_learn.domain.entity.test1.TestEntity;
import com.lwk4you.springboot_learn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

   @GetMapping("test/{id}")
       public TestEntity getTestEntityById(@PathVariable Integer id){

           return testService.getTestById(id);

  }

    @GetMapping("test2/{id}")
    public TestEntity getTestEntityById2(@PathVariable Integer id){

        return testService.getTestById2(id);

    }




}
