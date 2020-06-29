package com.test04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(public void *(..))")
	//void 반환형이 없는 타입이라 호출X /void=>*,String(Person클래스가 String형임)로 바꾸면 호출됨 
	public void before(JoinPoint join) {
		System.out.println("출석카드를 찍는다.");
	}
	@AfterThrowing("execution(public * *(..))")
	public void throwing(JoinPoint join) {
		//예외가 발생 했을 때 실행
		System.out.println("쉬는날");
	}
	@AfterReturning(pointcut="execution(public * *(..))",returning="returnVal") // after()끝나고 호출됨
	public void returning(JoinPoint join,Object returnVal) {
		//정상적 호출으로 종료된 후에 실행
		System.out.println(returnVal+"성공");
	}
	@After("execution(public * com.test04.*.*(..))")//com.test04.어떤클래스.어떤메소드던지(매개변수)
	public void after(JoinPoint join) {
		System.out.println("집에간다.");
	}
}
