package com.ajie.springboot;

import com.ajie.springboot.controller.HelloController;
import com.ajie.springboot.pojos.Person;
import com.ajie.springboot.pojos.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author ajie
 * @date 2023/7/31
 * @description:
 */
@RunWith(SpringRunner.class) // @RunWith:运行器
@SpringBootTest // 标记为当前类为SpringBoot测试类，加载项目的ApplicationContext上下文环境
public class SpringBootDemoApplicationTests {
    /**
     * RunWith 添加运行器
     * SpringJUnit4ClassRunner.class:Spring运行环境
     * JUnit4.class:JUnit运行环境
     * SpringRunner.class:Spring Boot运行环境
     */
    @Autowired
    private HelloController helloController;


    /**
     * 调用 helloController 中 sayHello 方法
     */
    @Test
    public void contextLoads() {
        // 类名必须声明为 public
        String result = helloController.sayHello();
        System.out.println(result);
    }

    @Autowired
    private Person person;

    @Test
    public void configurationTest() {
        System.out.println(person);
    }

    @Autowired
    private Student student;

    @Test
    public void configurationTest2() {
        System.out.println(student);
    }


}
