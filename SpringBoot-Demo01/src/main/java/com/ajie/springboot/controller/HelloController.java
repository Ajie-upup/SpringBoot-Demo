package com.ajie.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ajie
 * @date 2023/7/31
 * @description:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/boot")
    public String sayHello() {
        return "你好  Spring Boot !";
    }
}
