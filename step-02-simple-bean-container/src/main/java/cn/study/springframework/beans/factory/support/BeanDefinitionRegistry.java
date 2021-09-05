package cn.study.springframework.beans.factory.support;

import cn.study.springframework.beans.BeansException;
import cn.study.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void  registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
