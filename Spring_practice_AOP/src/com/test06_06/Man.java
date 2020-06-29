package com.test06_06;

import org.springframework.stereotype.Component;

@Component
public class Man implements Person{

	@Override
	public void classWork() {
		System.out.println("흐드미 연결");
		
	}

}
