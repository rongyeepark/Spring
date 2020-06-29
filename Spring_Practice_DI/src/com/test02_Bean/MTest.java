package com.test02_Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02_Bean/applicationContext.xml");
		Address park =(Address)factory.getBean("park");
		System.out.println(park);
		
		Address kim=(Address)factory.getBean("kim");
		System.out.println(kim);
	}

}
