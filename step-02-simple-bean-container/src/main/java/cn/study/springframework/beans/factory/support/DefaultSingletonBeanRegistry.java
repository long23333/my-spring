package cn.study.springframework.beans.factory.support;

import cn.study.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 后续其他类继承可以直接拥有单例注册的能力
 * 定义保护等级的添加bean方法
 * */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String name) {
        return singletonObjects.get(name);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        //todo 这里没有做单例校验，后面可以补上
        singletonObjects.put(beanName, singletonObject);
    }
}
