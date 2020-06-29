package com.mvc.upgrade;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.upgrade.biz.MemberBiz;
import com.mvc.upgrade.model.dto.MemberDto;

@Controller
public class MemberController {
	private Logger logger =LoggerFactory.getLogger(MemberController.class);
	@Autowired
	private MemberBiz biz;
	
	@RequestMapping("/loginform.do")
	public String loginForm() {
		logger.info("LOGIN FORM");
		
		return "mvclogin";
	}
	@RequestMapping(value="/ajaxlogin.do",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Boolean> ajaxLogin(HttpSession session,@RequestBody MemberDto dto){
		logger.info("LOGIN");
		/*
		 json으로 request한 파라미터들을 java에서 받으려면 java오브젝트 변환이 필요,
		 response시 java오브젝트를 json으로 변환이 필요
		 이를 처리햐주는 어노테이션 @RequestBody,@ResposeBody  
		  */
		MemberDto res = biz.login(dto);
		boolean check=false;
		if(res!= null) {
			session.setAttribute("login", res);
			check=true;
		}
		Map<String,Boolean> map = new HashMap<String,Boolean>();
		map.put("check",check);
		return map;
	}
}
