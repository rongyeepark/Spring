package com.test05_01.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05_01/anno/applicationContext.xml");
		MyNickNamePrn my = factory.getBean("myNickNamePrn",MyNickNamePrn.class);
		System.out.println(my);

	}

}
