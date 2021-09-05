package cn.study.springframework.beans.factory.support;

import cn.study.springframework.beans.BeansException;
import cn.study.springframework.beans.factory.BeanFactory;
import cn.study.springframework.beans.factory.config.BeanDefinition;

/**
 * 定义了抽象模板类型
 * 后续的类继承抽象类型实现模板方法，提供了统一的接口
 * */

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    /**
     * 通过实现getBean来固定实现逻辑顺序
     * 通过抽象方法getBeanDefinition createBean
     * 提供拓展点来让后面继承的类来实现
     * */
    @Override
    public Object getBean(String name) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        //实例化bean的方法没有自己实现而是交由其他实现类实现，提供了拓展的接入口
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String name, BeanDefinition beanDefinition) throws BeansException;

}

