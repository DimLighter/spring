package com.hhg.jerry.aop;

import com.hhg.jerry.aop.annotation.DummyOperation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * Created by lining on 2018/9/29.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-aop.xml", "classpath:applicationContext.xml"})
public class AopTest {

    @Autowired
    private DummyOperation dummyOperation;

    @Resource
    IAopService aopServiceA;
    @Resource
    IAopService aopServiceB;

    @Test
    public void addTest(){
        dummyOperation.add();
        dummyOperation.get();
    }

    @Test
    public void throwExTest(){
        dummyOperation.throwEx();
    }

    @Test
    public void xmlTest(){
        aopServiceA.service1();
        aopServiceA.addLog();

        aopServiceB.service1();
        aopServiceB.addLog();


    }

    @Test
    public void xmlExceptionTest(){
        aopServiceA.divideZero();
        aopServiceB.divideZero();
    }

}