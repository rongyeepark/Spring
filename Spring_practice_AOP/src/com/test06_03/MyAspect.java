package com.test06_03;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	public void before(JoinPoint in) {
		System.out.println(in.getTarget().getClass());
		System.out.println("출석카드를 찍는다");
	}
	public void after(JoinPoint in) {
		System.out.println("집에간다");
	}

}
