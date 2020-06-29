package com.test03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class MTest {

	public static void main(String[] args) {
		//기존방식
		//1.
//		Resource res = new FileSystemResource("src/com/test03/beans.xml");
//		BeanFactory factory = new XmlBeanFactory(res);//사용하지x
		//2.
//		Resource res = new ClassPathResource("com/test03/beans.xml");
//		BeanFactory factory = new XmlBeanFactory(res);//사용하지x
		
		//3.스프링의 기본적인 컨테이너(BeanFactory/ApplicationContext)
		//*BeanFactory:DI의 기본사항을 제공(getBean을 호출하는 시점에 생성함),레이지로딩
		//*ApplicationContext:BeanFactory의 자식으로 좀 더 다양한 기능을 가지고 있음,BeanFactory를 상속받음
		//                    ApplicationContext을사용하여 설정파일을 읽어와서 사용(미리 bean 생성/요청하면 바로 주입/싱글톤타입)
		//ClassPatchXmlApplication을 통해 객체 생성
		//토비의 스프링(스프링바이블)
		ApplicationContext factory  = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		//ClassPathXmlApplicationContext:지정된 classpath에서 xml파일을 읽어 생성
		
		//스프링의 ApplicationContext 인터페이스의 몇가지 기본 구현을 제공함.
		//스프링의A pplicationContenxt 객체는 스프링 컨테이너의 인스턴스임.
		MessageBean bean=(MessageBean)factory.getBean("korean"); 
		//getBean을통해 의존성 주입을하여 bean을 인스턴스화(객체)하여 설정
		bean.sayHello("스프링");
		bean=(MessageBean)factory.getBean("english"); 
		bean.sayHello("Spring");
		

		
		
	
	}

}
