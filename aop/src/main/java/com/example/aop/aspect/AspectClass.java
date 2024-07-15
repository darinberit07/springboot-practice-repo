package com.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class AspectClass {
	
	Logger logger = LoggerFactory.getLogger(AspectClass.class);
	
	@Pointcut("execution(* com.example.aop.controller.ControllerClass.*(..))")
	public void controllerPointcut() {}
	
	@Pointcut("execution(* com.example.aop.service.ServiceClass.*(..))")
	public void servicePointcut() {}
	
	//Before and After using Controller Class
	@Before("controllerPointcut()")
	public void beforeControllerAdvice(JoinPoint joinpoint) {
		logger.info("Before the pointcut: "+ joinpoint.getSignature());
	}
	
	@After("controllerPointcut()")
	public void afterControllerAdvice(JoinPoint joinpoint) {
		logger.info("After the pointcut: "+ joinpoint.getSignature());
	}
	
	//Around Advice using Service Class
	@Around("servicePointcut()")
	public Object aroundServiceAdvice(ProceedingJoinPoint pjp) throws Throwable{
		Object result;
		logger.info("Around Advice - Before pointcut: "+ pjp.getSignature());
		result = pjp.proceed();
		logger.info("Around Advice - After pointcut: "+ pjp.getSignature());
		return result;
	}
}
