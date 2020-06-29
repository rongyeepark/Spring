package com.test06_04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test06_04/applicationContext.xml");
		Person w = factory.getBean("woman",Person.class);
		Person m = factory.getBean("man",Person.class);
		System.out.println("여학생입장");
		w.classWork();
		System.out.println("남학생입장");
		m.classWork();
	}

}
