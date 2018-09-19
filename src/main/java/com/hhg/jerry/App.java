package com.hhg.jerry;

import com.hhg.jerry.aop.IAopService;
import com.hhg.jerry.bean.User;
import com.hhg.jerry.service.UserService;
import com.hhg.jerry.test.BaseClass;
import com.hhg.jerry.test.Com1Class;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml","applicationContext-bean.xml","spring-aop.xml");
        User ted = applicationContext.getBean("ted",User.class);
        logger.info(ted.toString());
        User dennis = (User)applicationContext.getBean("dennis");
        logger.info(dennis.toString());

        logger.info(applicationContext.getBeanDefinitionCount()+"");
        logger.info(applicationContext.getBeanDefinitionNames()+"");

        UserService userService = applicationContext.getBean(UserService.class);
        User dummyUser = userService.getById(1L);
        logger.info(dummyUser.toString());

        BaseClass baseClass = new Com1Class();
        baseClass.logTest();
        baseClass.baseClassLogMethod();

        IAopService aopServiceA = applicationContext.getBean("aopServiceA", IAopService.class);
        IAopService aopServiceB = applicationContext.getBean("aopServiceB", IAopService.class);
        aopServiceA.service1();
        System.out.println();
        aopServiceA.addLog();
        System.out.println();
        aopServiceB.service1();
        System.out.println();
        aopServiceB.addLog();

        System.out.println();
        aopServiceA.divideZero();
        aopServiceB.divideZero();

        System.out.println("APP finished");
    }
}
