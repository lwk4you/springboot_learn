package com.lwk4you.springboot_learn.controller;

import com.lwk4you.springboot_learn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
    @Autowired
    private TestService testService;
    @RestController
    public class HelloWorldController {
        @RequestMapping("/hello")
        public String index() {
            return "Hello World";
        }
    }


}
