package com.test03_05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03_05/applicationContext.xml");
		Developer park = factory.getBean("parks",Developer.class);
		Engineer kim = (Engineer)factory.getBean("kims");
		System.out.println(park);
		System.out.println(kim);

	}

}
