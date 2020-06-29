package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		//getBean()을 통해 생성된 bean 주입 후  각 bean의 필드값 출력 
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		Emp park =(Emp)factory.getBean("park");
		Emp lee =(Emp)factory.getBean("lee");
		Emp hong=(Emp)factory.getBean("hong");
		System.out.println(park);
		System.out.println(lee);
		System.out.println(hong);
		
	}

}
