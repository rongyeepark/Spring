package com.test06;

public class BeanFactory {
	Object getBean(String beanName) {
		if(beanName.equals("Samsung")) {
			return new SamsungTV();
		}else if(beanName.equals("lg")) {
			return new lgTV();
		}
		return null;
	}
}
