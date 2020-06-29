package com.test01;

public class Woman {
	public void classWork() {
		//횡단관점
		System.out.println("출석카드를 찍는다.");
		
		try {
			//CC핵심관점
			System.out.println("카트를 한다");
		}catch(Exception e) {
			//횡단관점
			System.out.println("쉬는날임.");
		}finally {
			//횡단관점
			System.out.println("집으로.");
		}
	}

}
