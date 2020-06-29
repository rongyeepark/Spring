package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test07/applicationContext.xml");
		System.out.println("Spring Bean Container 생성 완료");
		TV tv = (TV)factory.getBean("lg");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		//lg bean에 lazy-init="true" 설정으로 samsungTV()만 호출됨 lgTV()메소드는 호출X getBean을 통해 호출가능  
	}

}
