package com.hhg.jerry.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lining on 2018/9/18.
 */
public class LogAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public void beforeLog(){
        logger.info("{} {} invoked... " , this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void afterLog(){
        logger.info("{} {} invoked... " , this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void aroundLog(ProceedingJoinPoint joinPoint) throws Throwable{
        try {
            logger.info("{} {} enter... " , this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
            joinPoint.proceed();
            logger.info("{} {} exit... " , this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public void afterReturningLog(JoinPoint joinPoint, Object val){
        logger.info("{} {} invoked with return val={}... " , this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), val);
    }

    public void afterThrowingLog(Throwable throwable){
        logger.info("{} {} invoked, exception msg: {} " , this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName(), throwable.getMessage());
    }
}
