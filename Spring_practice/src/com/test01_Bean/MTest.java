package com.test01_Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01_Bean/applicationContext.xml");
		MessageBean fruit = (MessageBean)factory.getBean("banana");
		fruit.sayHello();
		
		fruit =(MessageBean)factory.getBean("apple");
		fruit.sayHello();
		
		fruit=(MessageBean)factory.getBean("mango");
		fruit.sayHello();

	}

}
