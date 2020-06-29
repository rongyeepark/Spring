package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05/applicationContext.xml");
		
		Developer park = factory.getBean("parks",Developer.class);
		Engineer kim =factory.getBean("kims",Engineer.class);
		System.out.println(park);
		System.out.println(kim);
		
	}

}
