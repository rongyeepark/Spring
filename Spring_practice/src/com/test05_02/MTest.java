package com.test05_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05_02/applicationContext.xml");
		School p = factory.getBean("student",School.class);
		System.out.println(p);

	}

}
