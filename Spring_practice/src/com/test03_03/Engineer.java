package com.test03_03;

public class Engineer extends Emp {
	private String dept;

	public Engineer() {
		super();
		
	}

	public Engineer(String name, int salary) {
		super(name, salary);
		
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString()+"\t부서:"+dept;
	}
	
	

}
