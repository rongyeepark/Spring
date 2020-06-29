package com.test03_04;

public class Developer {
	private Emp emp;
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
