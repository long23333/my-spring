package cn.study.springframework.beans.factory.support;

import cn.study.springframework.beans.BeansException;
import cn.study.springframework.beans.factory.config.BeanDefinition;
/**
 * 实现了bean的创建并注册放入单例缓存中
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String name, BeanDefinition beanDefinition) throws BeansException {
        Object bean=null;
        try {
            //若是有参数的构造方法则会报错
            bean=beanDefinition.getBean().newInstance();
        } catch (IllegalAccessException |InstantiationException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(name,bean);
        return bean;
    }
}
