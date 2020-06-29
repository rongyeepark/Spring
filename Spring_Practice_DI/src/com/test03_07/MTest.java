package com.test03_07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03_07/applicationContext.xml");
		
		TV lg = (TV)factory.getBean("samsung");
		lg.on();
		lg.off();
		lg.up();
		lg.down();
	}
}
