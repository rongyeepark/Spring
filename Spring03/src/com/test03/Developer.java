package com.test03;

public class Developer extends Emp {
	private String dept;
	
	public Developer() {}
	public Developer(String name,int salary) {
		super(name,salary); //name,salary는 부모생성자꺼기 때문에 부모생성자로 넘겨줘야해서 super()로 처리
	}
	public void setDept(String dept) {
		this.dept=dept;
	
	}
	@Override
	public String toString() {
		return super.toString()+"\t부서:"+dept;
	}

}
