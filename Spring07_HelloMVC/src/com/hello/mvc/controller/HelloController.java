package com.hello.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hello.mvc.model.HelloBiz;

@Controller
public class HelloController {
	@Autowired //생성된 빈중에 같은 놈이 있으면 자동으로 주입시키겠다.
	private HelloBiz biz;
	
	@RequestMapping("/hello.do")//핸들러매핑으로 누가 처리할지 찾음 찾고 컨트롤러로 보냄
	public String getHello(Model model) {
		//ModelAndView
		model.addAttribute("message",biz.getHello());
		return "/WEB-INF/views/hello.jsp"; //응답하려는 페이지명으로 리턴
	}
	@RequestMapping("/bye.do")
	public ModelAndView getBye(@RequestParam("name") String nickname) {
		//요청할때 들어오는 name=spring을 nickname이 받겠다 
		ModelAndView mav = new ModelAndView(); // 객체생성하고 넘길 name까지 설정
		mav.setViewName("/WEB-INF/views/bye.jsp"); //뷰는 경로를 담아줌
		mav.addObject("message","Bye,"+nickname); //데이터를 추가 
		
		return mav;
	}
	
}
