package com.hhg.jerry.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by lining on 2018/9/19.
 */
@Component
public class DummyOperation {
    public Integer add(){
        return 33;
    }

    public String get(){
        return "nothing";
    }

    public void throwEx(){
        throw new RuntimeException("test exception!!!");
    }
}
