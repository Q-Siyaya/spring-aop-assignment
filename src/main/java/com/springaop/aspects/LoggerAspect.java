package com.springaop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect {

    private Logger logger=Logger.getLogger(LoggerAspect.class.getName());
    @Around("execution(* com.springaop.services.*.*(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint)throws Throwable
    {
        logger.info(proceedingJoinPoint.getSignature()+" method execution start");
        Instant start =Instant.now();

        Object result=proceedingJoinPoint.proceed();
        Instant finsih=Instant.now();

        Long timeElaspsed= Duration.between(start,finsih).toMillis();
        logger.info("Time took to execute method: "+timeElaspsed);
        logger.info(proceedingJoinPoint.getSignature()+" method execution end");

        return  result;
    }

//    @Around("annotation(com.springaop.interfaces.LogAspect)")
//    public  void logWithAnnotation(ProceedingJoinPoint proceedingJoinPoint)throws Throwable
//    {
//        logger.info(proceedingJoinPoint.getSignature()+" method execution start");
//        Instant start =Instant.now();
//
//        proceedingJoinPoint.proceed();
//        Instant finsih=Instant.now();
//
//        Long timeElaspsed= Duration.between(start,finsih).toMillis();
//
//        logger.info("Time took to execute method: "+timeElaspsed);
//        logger.info(proceedingJoinPoint.getSignature()+" method execution end");
//    }
}
