package com.test03_04;

public class Engineer {
	private Emp emp;
	private String dept;

	public Engineer() {
		super();

	}

	public Engineer(Emp emp, String dept) {
		super();
		this.emp = emp;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Engineer [emp=" + emp + ", dept=" + dept + "]";
	}

}
