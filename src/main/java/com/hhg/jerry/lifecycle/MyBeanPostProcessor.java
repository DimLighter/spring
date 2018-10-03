package com.hhg.jerry.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by lina on 2018/10/3.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public MyBeanPostProcessor(){
        super();
        logger.info("constructor invoked");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        logger.info("beanName is {}", beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("beanName is {}", beanName);
        return bean;
    }

}
