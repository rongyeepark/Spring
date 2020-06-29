package com.test01.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/anno/applicationContext.xml");
		//@Autowired로 인해 id를 부여하지 않아도 클래스 이름으로 호출
		//Bean이 클래스를 생성할때 앞글자가 자동으로 소문자로 생성됨.ex)myNickNamePrn
		MyNickNamePrn my = factory.getBean("myNickNamePrn",MyNickNamePrn.class);
		System.out.println(my);
	}

}
