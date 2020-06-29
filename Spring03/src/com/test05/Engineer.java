package com.test05;

public class Engineer {
	private Emp emp;
	private String dept;

	//(기본/매개변수 있는)생성자 ,getter/setter,toString

	public Engineer() {
		super();

	}

	public Engineer(Emp emp, String dept) {
		super();
		this.emp = emp;
		this.dept = dept;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Engineer [emp=" + emp + ", dept=" + dept + "]";
	}

}
