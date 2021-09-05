package cn.study.springframework.beans;

import cn.study.springframework.beans.bean.UserService;
import cn.study.springframework.beans.factory.config.BeanDefinition;
import cn.study.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApiTest {
    @Test
    public void test_BeanFactory() {
        //初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        //第二次获取bean
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
        System.out.println(userService==userService_singleton);
    }
}