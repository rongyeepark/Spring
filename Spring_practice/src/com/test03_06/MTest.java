package com.test03_06;

public class MTest {

	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		
		TV tv=(TV)factory.getBean("lg");
		tv.on();
		tv.off();
		tv.up();
		tv.down();

	}

}
