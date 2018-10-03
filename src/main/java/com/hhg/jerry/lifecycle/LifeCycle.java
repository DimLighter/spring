package com.hhg.jerry.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Created by lina on 2018/10/3.
 */
public class LifeCycle implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private String name;
    private String testProperty;
    private BeanFactory beanFactory;
    private String beanName;
    public LifeCycle(){
        logger.info("constructor invoked");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        logger.info("set name invoked with name {}", name);
        this.name = name;
    }

    public String getTestProperty() {
        return testProperty;
    }

    public void setTestProperty(String testProperty) {
        logger.info("set name invoked with testProperty {}", testProperty);
        this.testProperty = testProperty;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.info("beanFactory setter invoked");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        logger.info("setBeanName setter invoked with name : {}", name);
        this.beanName = name;
    }

    @Override
    public void destroy() throws Exception {
        logger.info("invoked");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("invoked");
    }

    public void myInit(){
        logger.info("invoked");
    }

    public void myDestroy(){
        logger.info("invoked");
    }

}
