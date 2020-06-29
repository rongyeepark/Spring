package com.test03_06;

public class BeanFactory {
	//Object형이 아니라 TV타입으로 해도 상관없음!
	Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new samsungTV();
		}else if(beanName.equals("lg")) {
			return new lgTV();
		}
		
		
		return null;
	}

}
