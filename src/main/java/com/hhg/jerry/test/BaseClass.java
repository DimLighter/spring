package com.hhg.jerry.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lining on 2018/9/11.
 */
public abstract class BaseClass {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    public abstract void logTest();

    public void baseClassLogMethod(){
        logger.info("My name is {}" , this.getClass().getName());
    }
}
