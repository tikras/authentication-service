package com.socialbook.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("/")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }
}