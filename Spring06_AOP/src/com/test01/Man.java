package com.test01;

public class Man {
	public void classWork() {
		//횡단관점
		System.out.println("출석카드를 찍는다.");
		try {
			//CC핵심관점
			System.out.println("흐드미 연결");
		}catch(Exception e) {
			//횡단관점
			System.out.println("쉬는날임");
		}finally {
			//횡단관점
			System.out.println("집으로.");
		}
	
	}

}
