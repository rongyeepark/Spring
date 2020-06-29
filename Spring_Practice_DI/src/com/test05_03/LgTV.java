package com.test05_03;

import org.springframework.stereotype.Component;

@Component("lg")
public class LgTV implements TV{

	@Override
	public void on() {
		System.out.println("lg on");
	}

	@Override
	public void off() {
		System.out.println("lg off");
	}

	@Override
	public void up() {
		System.out.println("lg up");
	}

	@Override
	public void down() {
		System.out.println("lg down");
	}

}
