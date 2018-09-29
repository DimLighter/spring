package com.hhg.jerry.aop.xml;

import com.hhg.jerry.aop.IAopService;

/**
 * Created by lining on 2018/9/17.
 */
public class AopServiceB implements IAopService {
    public Integer service1() {
        System.out.println(this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName() + " invoked.");
        return 2;
    }

    public String service2() {
        System.out.println(this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName() + " invoked.");
        return this.getClass().getSimpleName();
    }

    public Long addLog() {
        System.out.println(this.getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName() + " invoked.");
        return 2L;
    }

    public void divideZero(){
        throw new ArrayIndexOutOfBoundsException("Manual made exception...");
    }
}
