package com.wsd.test;

import com.wsd.service.UserService;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tm on 2018/7/19.
 */
public class UserTest {
    private static ApplicationContext context;
    private static UserService ss;
    //类加载之前执行的方法
    @BeforeClass
    public static void  beforeClass(){
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    //类加载之后执行的方法
    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass...");
    }

    //在测试方法执行之前执行的方法
    @Before
    public void before(){
        ss = context.getBean(UserService.class);
    }

    //在测试方法执行之后执行的方法
    @After
    public void after(){
        System.out.println("after...");
    }

    //不被测试的方法
    @Ignore
    public void test(){/*
		ad.addStudent("kk", 13, "男");
	*/}
    //当前测试的方法
    @org.junit.Test
    public void test1(){
        System.out.println(ss.getUser().getName());
    }
}
