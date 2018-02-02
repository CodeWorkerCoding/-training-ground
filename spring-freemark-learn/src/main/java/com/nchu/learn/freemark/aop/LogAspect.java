package com.nchu.learn.freemark.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * 日志切面
 *
 * @author fujianjian
 * @project self-learn
 * @date 2018/2/2 15:10
 */
@Slf4j
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(public * com.nchu.learn.freemark.action..*.*(..))")
    public void commonLogCutPoint() {
    }

    @Around("commonLogCutPoint()")
    public Object commonLogCut(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        long startTime = System.currentTimeMillis();
        try {
            log.info("==========================================[INVOKER START]===========================================");
            log.info("URL: {}", request.getRequestURL().toString());
            log.info("HTTP MEHTOD: {}", request.getMethod());
            log.info("SOURCE IP: {}", request.getRemoteAddr());
            log.info("HANDLER CLASS METHOD: {}.{}", proceedingJoinPoint.getSignature().getDeclaringTypeName(),
                    proceedingJoinPoint.getSignature().getName());
            log.info("METHOD ARGS: {}", Arrays.toString(proceedingJoinPoint.getArgs()));
            Object result = proceedingJoinPoint.proceed();
            return result;

        } finally {
            long endTime = System.currentTimeMillis();
            double processTime = (endTime - startTime) / 1000d;
            log.info("PROCESS TIME: {}/s", processTime);
            log.info("==========================================[INVOKER END]===========================================");
        }

    }
}
