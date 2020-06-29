package com.test06_02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect  implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object target =null;
		System.out.println("뾰룡");
		try {
			target=invocation.proceed();
		}catch(Exception e) {
			System.out.println("예외");
		}finally {
			System.out.println("파이널리");
		}
		return target;
	}

}
