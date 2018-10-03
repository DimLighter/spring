package com.hhg.jerry.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by lina on 2018/10/3.
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public MyBeanFactoryPostProcessor(){
        logger.info("constructor invoked");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("lifeCycle");
        beanDefinition.getPropertyValues().addPropertyValue("testProperty",666);
    }
}
