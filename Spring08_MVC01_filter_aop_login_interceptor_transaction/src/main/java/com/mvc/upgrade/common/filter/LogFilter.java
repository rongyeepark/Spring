package com.mvc.upgrade.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter{
	//로그객체 생성
	private Logger logger = LoggerFactory.getLogger(LogFilter.class);
	//init():필터(객체) 초기화
	//doFilter():(어떻게 필터 처리할건지 )전후처리
	//destroy():필터 인스턴스 종료
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req =(HttpServletRequest) request; //ServletRequest request =>형변환
		String remoteAddr = req.getRemoteAddr();
		String uri = req.getRequestURI();
		String url=req.getRequestURL().toString();
		String queryString = req.getQueryString();
		
		String referer = req.getHeader("referer");
		String agent =req.getHeader("User-Agent");
		
		StringBuffer sb = new StringBuffer();
		sb.append("remoteAddr:"+remoteAddr+"\n") //ip주소
		.append("uri:"+uri+"\n")
		.append("url:"+url+"\n")
		.append("queryString:"+queryString+"\n")
		.append("refere:"+referer+"\n") //이젠 페이지(보내는 페이지)url
		.append("agent:"+agent); //사용자 정보(browser ,os등등등)
		
		logger.info("LOG FILTER\n"+sb);
		chain.doFilter(req, response);
	}

	@Override
	public void destroy() {
	}

}
