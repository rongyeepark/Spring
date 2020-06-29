package com.test06_04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class MyAspect {
	
	@Before("execution(public void *(..))")
	public void before(JoinPoint join) {
		System.out.println("출석카드");
		
	}
	@AfterThrowing("execution(public * *(..))")
	public void throwing(JoinPoint join) {
		System.out.println("쉬는날");
		
	}
	@AfterReturning(pointcut="execution(public * *(..))",returning="returnVal")
	public void returning(JoinPoint join,Object returnVal) {
		System.out.println(returnVal+"성공");
		
	}
	@After("execution(public * com.test06_04.*.*(..))")
	public void after(JoinPoint join) {
		System.out.println("집에가요");
		
	}
}
