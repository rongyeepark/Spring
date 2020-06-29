package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {

	public static void main(String[] args) {
	                                                                     // xml파일을 읽어올때 bean이 생성됨
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		MyClass myclass=(MyClass)factory.getBean("myClass");
		myclass.prn();
		
	}

}
