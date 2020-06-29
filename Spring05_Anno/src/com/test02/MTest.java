package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory= new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		//jeon,park 똑같은 타입이 2개가 있음 그래서 어떤걸 가져와야할지 몰라서 오류가남
		//@Qualifier 어노테이션을 통해서 이름을 지정해서 데려옴
		School person =factory.getBean("mySchool",School.class);
		System.out.println(person);
	}
}
