package com.test03;

public class MessageBeanKo implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.printf("안녕하세요, %s님\n",name);		
	}
	
}
