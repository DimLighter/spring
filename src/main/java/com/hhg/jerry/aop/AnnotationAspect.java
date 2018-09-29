package com.hhg.jerry.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by lining on 2018/9/19.
 */
@Component
@Aspect
public class AnnotationAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Pointcut("execution(* com.hhg.jerry.aop.annotation..*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature().getName());
    }

    @After("pointCut()")
    public void doAfter(JoinPoint joinPoint){
        logger.info(joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut="pointCut()", returning="val")
    public void afterReturn(JoinPoint joinPoint, Object val){
        logger.info("method:{}, return value:{}", joinPoint.getSignature().getName(), val);
    }

    @AfterThrowing(pointcut="pointCut()",throwing="error")
    public void afterThrowing(JoinPoint joinPoint,Throwable error){
        logger.info("method:{}, return value:{}", joinPoint.getSignature().getName(), error.getMessage());
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pjp){
        Object res = null;
        try {
            logger.info("method:{} around before", pjp.getSignature().getName());
            res = pjp.proceed();
            logger.info("method:{} around after", pjp.getSignature().getName());
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return res;
    }

}
