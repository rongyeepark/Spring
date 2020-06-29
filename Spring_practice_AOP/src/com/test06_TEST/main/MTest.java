package com.test06_TEST.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test06_TEST.entity.Shape;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test06_TEST/main/applicationContext.xml");
		Shape rect = factory.getBean("rect",Shape.class);
		Shape tri = factory.getBean("tri",Shape.class);
		
		rect.veiwSize();
		System.out.println("------------");
		tri.veiwSize();
	}

}
