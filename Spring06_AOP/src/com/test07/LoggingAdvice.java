package com.test07;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class LoggingAdvice implements MethodInterceptor {
	//로그(기록) 처리 
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName =invocation.getMethod().getName();
		
		StopWatch timer = new StopWatch();
		System.out.println("[LOG] METHOD:"+methodName+" is Calling");
		Object obj=invocation.proceed();
		timer.start(methodName);//시작시간찍어줌
		System.out.println("[LOG]METHOD:"+methodName+" was Called");
		System.out.println("[LOG]TIME:"+timer.getTotalTimeSeconds()+"sec");
		
		
		return null;
	}
	

}
