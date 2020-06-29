package com.test06_07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test06_07/applicationContext.xml");
		MessageBean bean = factory.getBean("proxy",MessageBean.class);
		bean.sayHello();
	}

}
