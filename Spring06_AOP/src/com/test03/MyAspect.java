package com.test03;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;

public class MyAspect {

	public void before(JoinPoint join) {
		System.out.println(join.getTarget().getClass());//target(.classWork()) 실제로 실행되어야 할 친구
		System.out.println("출석카드를 찍는다.");
	}
	public void after() {
		System.out.println("집에간다.");
	}

}
