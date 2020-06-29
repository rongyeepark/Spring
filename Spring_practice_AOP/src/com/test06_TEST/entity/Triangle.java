package com.test06_TEST.entity;

public class Triangle extends Shape {
	

	public Triangle() {
		super();
		
	}

	public Triangle(String title, int width, int height) {
		super(title, width, height);
		
	}

	@Override
	public void veiwSize() {
		System.out.println(getTitle()+"의 넓이:"+(getWidth()*getHeight())/2);
	}

}
