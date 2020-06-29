package com.test05_03;

import org.springframework.stereotype.Component;

@Component
public class SamsungTV implements TV{

	@Override
	public void on() {
		System.out.println("samsung on");
	}

	@Override
	public void off() {
		System.out.println("samsung off");
	}

	@Override
	public void up() {
		System.out.println("samsung up");
	}

	@Override
	public void down() {
		System.out.println("samsung down");
	}

}
