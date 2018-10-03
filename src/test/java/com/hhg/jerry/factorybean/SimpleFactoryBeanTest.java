package com.hhg.jerry.factorybean;

import com.hhg.jerry.bean.User;
import com.hhg.jerry.dao.IUserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lina on 2018/10/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-bean.xml")
public class SimpleFactoryBeanTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void simpleTest(){
        User u = (User)applicationContext.getBean("userFactoryBean");
        System.out.println(u);
        IUserDao userDao = (IUserDao)applicationContext.getBean("simpleFactoryBean");
        userDao.add(u);
    }
}
