package com.hhg.jerry.aop;

/**
 * Created by lining on 2018/9/17.
 */
public class TimeAspect {
    public void now(){
        System.out.println("Timestamp:" + System.currentTimeMillis());
    }
}
