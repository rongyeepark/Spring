package com.test04_01;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanTest {
	private MyClass myClass;
	
	public BeanTest() {
		System.out.println("기본생성자");
	}
	public BeanTest(Date date) {
		System.out.println("날짜생성자:"+date);
	}
 /////////////////////////////////////////////
	public void setMyClass(MyClass myClass) {
		System.out.println("myClass()호출");
	}
	public void setDate(Date date) {
		System.out.println("date호출");
	}
	public void setNumber(int num) {
		System.out.println("num호출:");
	}
	public void setArray(String[] arr) {
		System.out.println("arr호출:");
		for(String v : arr) {
			System.out.println("이름:"+v);
		}
	}
	public void setList(List<String> list) {
		System.out.println("list호출:");
		for(String s: list) {
			System.out.println(s);
		}
	}
	public void setSet(Set<String> set) {
		System.out.println("set호출:");
		for(String s : set) {
			System.out.println(s);
		}
	}
	public void setMap(Map<String,String> map) {
		System.out.println("map호출:");
		Collection <String> values =map.values();
		for(String m : values) {
			System.out.println(m);
		}
	}
	public void setScore(List<Score> list) {
		System.out.println("score 호출:");
		for(Score s: list) {
			System.out.println(s);
		}
	}
}
