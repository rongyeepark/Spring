package com.test06_07;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class LoggingAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String methodName=invocation.getMethod().getName();
		
		StopWatch timer= new StopWatch();
		System.out.println("[LOG] METHOD:"+methodName+" is calling");
		Object obj=invocation.proceed();
		timer.start(methodName);
		System.out.println("[LOG]METHOD:"+methodName+" was Called");
		System.out.println("[LOG]TIME:"+timer.getTotalTimeSeconds()+"sec");
		return null;
	}

}
