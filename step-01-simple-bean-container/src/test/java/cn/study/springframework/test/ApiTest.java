package cn.study.springframework.test;

import cn.study.springframework.BeanDefinition;
import cn.study.springframework.BeanFactory;
import cn.study.springframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {
    @Test
    public void tesBeanFactory() {
        //初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        //注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
