package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
//		AbstractTest today =(AbstractTest)factory.getBean("singleton");//아래와 같이 작성해도 됨
		AbstractTest today =factory.getBean("singleton",AbstractTest.class);//today=>getBean의객체가됨
		System.out.println("오늘은 "+today.dayInfo()+"입니다.");
		
	}

}
