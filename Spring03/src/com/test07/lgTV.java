package com.test07;

public class lgTV implements TV {
	public lgTV() {
		System.out.println("lgTV 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("LG TV ON");
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV OFF");
	}

	@Override
	public void volumeUp() {
		System.out.println("LG TV VolumeUp");
	}

	@Override
	public void volumeDown() {
		System.out.println("LG TV VolumeDown");
	}

}
