package com.hello.mvc.model;

import org.springframework.stereotype.Repository;

@Repository //dao로 인식
public class HelloDao {

 String getHello() {
	  
		return "Spring";
	}
	

}
