package com.hhg.jerry;

import com.hhg.jerry.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml","applicationContext-service.xml");
        User ted = applicationContext.getBean("ted",User.class);
        System.out.println(ted);
        User dennis = (User)applicationContext.getBean("dennis");
        System.out.println(dennis);

        System.out.println(applicationContext.getBeanDefinitionCount());
        System.out.println(applicationContext.getBeanDefinitionNames());
    }
}
