package com.mvc.upgrade;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.biz.BoardBiz;
import com.mvc.upgrade.model.dto.BoardDto;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private BoardBiz biz;

	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//기본적으로 제공하는 메서드
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		//viewResolver에서 처리를 작성함(servlet-context.xml)
		return "home";
	}
	@RequestMapping("/list.do")
	public String list(Model model) {
		logger.info("SELECT LIST");
		model.addAttribute("list",biz.selectList()); //model에 list를 담음
		return "mvclist";
	}
	@RequestMapping("/insertform.do")
	public String insertForm() {
		logger.info("INSERT FROM");
		return "mvcinsert";
	}
	@RequestMapping("/insertres.do")
	public String insertres(BoardDto dto) {
		logger.info("INSERT RES");
		int res=biz.insert(dto);
		
		if(res>0){
			return "redirect:list.do";
		}else {
			return "redirect:insertform.do";
		}
	}
	@RequestMapping("/detail.do")
	public String detail(Model model,int myno) {
		logger.info("SELECT ONE");
		model.addAttribute("dto",biz.selectOne(myno));
		//model:데이터를 저장하고 view에 접근 하기위해 사용하는 친구
		return "mvcdetail";
	}
	@RequestMapping("/updateform.do")
	public String updateform(Model model ,int myno) {
		logger.info("UPDATE FROM");
		model.addAttribute("dto", biz.selectOne(myno));
		
		return"mvcupdate";
	}
	@RequestMapping("/updateres.do")
	public String updateRes(BoardDto dto) {
		logger.info("UPDATE RES");
		int res=biz.update(dto);
		
		if(res>0) {
			return "redirect:detail.do?myno="+dto.getMyno();
		}else {
			return "redirect:updateform.do?myno="+dto.getMyno();
		}	
	}
	@RequestMapping("/delete.do")
	public String delete(int myno) {
		logger.info("DELETE");
		int res=biz.delete(myno);
		
		if(res>0) {
			return "redirect:list.do";
		}else {
			return "redirect:detail.do?myno="+myno;
		}
	}
}
