package com.test06;

public class SamsungTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("SAMASUNG TV ON");
	}

	@Override
	public void powerOff() {
		System.out.println("SAMASUNG TV OFF");
	}

	@Override
	public void volumeUp() {
		System.out.println("SAMASUNG TV Volume Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("SAMASUNG TV Volume Down");
	}

}
