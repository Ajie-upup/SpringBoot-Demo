package com.ajie.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ajie
 * @date 2023/7/31
 * @description:
 */

@SpringBootApplication // 标识当前类为SpringBoot项目的启动类
public class SpringBootDemoApplication {

    /**
     * SpringBoot的启动类通常放在二级包中，比如：com.ajie.springboot.SpringBootDemoApplication
     * 因为SpringBoot项目在做包扫描，会扫描启动类所在的包及其子包下的所有内容。
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
