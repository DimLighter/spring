package com.hhg.jerry.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lina on 2018/10/3.
 */
public class SimpleFactoryBean implements FactoryBean<Object>, InitializingBean {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Class cls;
    private String className;
    private Object proxy;
    private Object target;
    @Override
    public Object getObject() throws Exception {
        return proxy;
    }

    @Override
    public Class<?> getObjectType() {
        return proxy == null ? target.getClass() : proxy.getClass();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        proxy = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = method.invoke(target, args);
                logger.info("target class:{}, method : {}, result : {}", target.getClass(), method.getName(), result);
                return result;
            }
        });
        logger.info("invoked...");
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) throws ClassNotFoundException{
        this.className = className;
        this.cls = Class.forName(className);
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}
