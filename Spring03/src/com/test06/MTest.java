package com.test06;

public class MTest {

	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		
		TV tv=(TV)factory.getBean("lg");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		TV tv1=(TV)factory.getBean("Samsung");
		tv1.powerOn();
		tv1.powerOff();
		tv1.volumeUp();
		tv1.volumeDown();
	}

}
