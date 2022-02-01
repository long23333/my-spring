package cn.study.springframework.beans.factory.config;

/**定义单例bean获取接口，注册由实现类实现*/
public interface SingletonBeanRegistry {
    Object getSingleton(String name);
}
