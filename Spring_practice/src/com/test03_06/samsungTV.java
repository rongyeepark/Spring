package com.test03_06;

public class samsungTV implements TV {

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
