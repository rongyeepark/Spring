package com.test03_Hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/bean.xml");
		MessageBean bean = (MessageBean)factory.getBean("korean");
		bean.sayHello("스프링");
		bean=(MessageBean)factory.getBean("english");
		bean.sayHello("Spring");

	}

}
