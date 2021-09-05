package cn.study.springframework.beans.factory.config;

/**
 * 记录class的信息，后续可以延迟实例化bean，
 * */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBean() {
        return beanClass;
    }

    public void setBean(Class beanClass) {
        this.beanClass = beanClass;
    }
}
