package com.test06;

public class lgTV implements TV{

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
		System.out.println("LG TV Volume Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("LG TV Volume Down");
	}

}
