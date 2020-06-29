package com.test06;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyAspect {
	@Pointcut("execution(public * *(..))") 
	//어드바이스를 어디에 적용할지 결정
	public void myClass() {
		//포인트컷이 됐기대문에 after ,before 되기도 함.=>모든 JoinPoint들의 결합체
	}
	@Before("myClass()")
	public void before(JoinPoint join) {
		System.out.println("출첵");
	}
	@After("myClass()")
	public void after(JoinPoint join) {
		System.out.println("집에간다");
	}
	

}
