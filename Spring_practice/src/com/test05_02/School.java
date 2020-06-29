package com.test05_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class School {
	@Autowired
	@Qualifier("kim")
	private Student student;
	private String grade;

	public School() {
		super();

	}

	public School(Student student, String grade) {
		super();
		this.student = student;
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "School [student=" + student + ", grade=" + grade + "]";
	}

}
