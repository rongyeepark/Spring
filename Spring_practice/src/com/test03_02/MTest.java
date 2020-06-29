package com.test03_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03_02/applicationContext.xml");
		Emp park=(Emp)factory.getBean("park");
		System.out.println(park);
		Emp kim=(Emp)factory.getBean("kim");
		System.out.println(kim);
	}

}
