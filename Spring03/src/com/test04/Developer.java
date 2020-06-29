package com.test04;

public class Developer {
	private Emp emp; //emp객체가 들어가야함
	private String dept;
	public Developer() {
		super();
		
	}
	public Developer(Emp emp, String dept) {
		super();
		this.emp = emp;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Developer [emp=" + emp + ", dept=" + dept + "]";
	}
	
	
}
