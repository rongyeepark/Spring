package com.test06_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test06_02/applicationContext.xml");
		Person w =factory.getBean("woman",Person.class);
		w.classWork();
		

	}

}
