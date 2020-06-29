package com.test02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class School {
	@Autowired //의존관계를 자동으로 설정(주입)하겠음
	@Qualifier("jeon")
	private Student person;
//	@Autowired //의존관계를 자동으로 설정(주입)하겠음
//	@Qualifier("park")
//	private Student person2;
	//2개의 student bean을 같이 쓰려면 필드를 하나 더 추가해서 위와 같이 작성해야함
	private int grade;


	public School() {
		super();

	}

	public School(Student person, int grade) {
		super();
		this.person = person;
		this.grade = grade;
	}

	public Student getPerson() {
		return person;
	}

	public void setPerson(Student person) {
		this.person = person;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "School [person=" + person + ", grade=" + grade + "]";
	}

}
