package com.lwk4you.springboot_learn;

import com.fasterxml.jackson.databind.util.ClassUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.repository.util.ClassUtils;

@SpringBootApplication
@EnableCaching
public class SpringbootLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLearnApplication.class, args);
    }




}
