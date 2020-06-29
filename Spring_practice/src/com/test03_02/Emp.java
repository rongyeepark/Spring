package com.test03_02;

public class Emp {
	private String name;
	private int salary;
	
	//1.생성자(기본,매개변수)
	//2.getter/setter
	//3.toString
	
	
	public Emp() {
		super();
		
	}
	

	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + "]";
	}
	

	
}
