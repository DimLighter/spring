package com.hhg.jerry.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lina on 2018/10/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-bean.xml")
public class LifeCyCleTest {
    @Autowired
    private LifeCycle lifeCycle;
    @Test
    public void classTest(){
        lifeCycle.getName();
        System.out.println(lifeCycle.getTestProperty());
    }
}
