package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
	
		//1.factory생성
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		//2.getBean 통해 lgTV
		TV lg =(TV)factory.getBean("lgTV");
		//3.메소드 4개 실행(on,off,up,down)
		lg.powerOn();
		lg.powerOff();
		lg.VolumeUp();
		lg.VolumeDowm();
		//4.getBean 통해 samsungTV
		TV ss =factory.getBean("samsung",TV.class);
		//5.메소드 4개 실행(on,off,up,down)
		ss.powerOn();
		ss.powerOff();
		ss.VolumeUp();
		ss.VolumeDowm();
		
		

	}

}
