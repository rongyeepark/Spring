package com.test02_Hello;

public class MTest {

	public static void main(String[] args) {
		MessageBean mb = new MessageBeanKo();
		mb.sayHello("쏠");
		mb= new MessageBeanEn();
		mb.sayHello("SSOL");
	}

}
