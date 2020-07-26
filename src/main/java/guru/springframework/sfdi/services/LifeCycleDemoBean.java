package guru.springframework.sfdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("# I'm in LifeCycleBean Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("# Bean Factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("# My bean name is: " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("# Application Context has been set");
    }

    //called during bean destruction in shutdown
    @Override
    public void destroy() throws Exception {
        System.out.println("# The LifeCycleBean has terminated");
    }

    //called by framework after the properties are set
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("# The LifeCycleBean has its properties set");
    }

    //called after bean has been constructed, but before it's returned to the requesting object
    @PostConstruct
    public void postConstruct() {
        System.out.println("# the post construct annotated method has been called");
    }

    //called just before the bean is destroyed by the container
    @PreDestroy
    public void preDestroy() {
        System.out.println("# the preDestroy annotated method has been called");
    }

    public void beforeInit() {
        System.out.println("# before init - called by bean post processor");
    }

    public void afterInit() {
        System.out.println("# after init - called by bean post processor");
    }
}
