package com.test05_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05_03/applicationContext.xml");
		TV tv =factory.getBean("lg",TV.class);
		tv.on();
		tv.off();
		tv.up();
		tv.down();

	}

}
