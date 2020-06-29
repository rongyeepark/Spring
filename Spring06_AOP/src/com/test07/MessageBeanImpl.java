package com.test07;

public class MessageBeanImpl implements MessageBean{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//어드바이스 =>공통으로 들어가는 친구들
		System.out.println("Hello,"+name);
	}
	

}
