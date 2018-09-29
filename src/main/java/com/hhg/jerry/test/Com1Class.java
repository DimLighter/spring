package com.hhg.jerry.test;

/**
 * Created by lining on 2018/9/11.
 */
public class Com1Class extends BaseClass {
    public void logTest() {
        logger.info("My name is {}", this.getClass().getName());
    }
}
