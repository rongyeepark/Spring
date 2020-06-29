package com.test07;

public class samsungTV implements TV {
	public samsungTV() {
		System.out.println("samsungTV 생성");
	}
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
		System.out.println("SAMASUNG TV VolumeUp");
	}

	@Override
	public void volumeDown() {
		System.out.println("SAMASUNG TV VolumeDown");
	}

}
