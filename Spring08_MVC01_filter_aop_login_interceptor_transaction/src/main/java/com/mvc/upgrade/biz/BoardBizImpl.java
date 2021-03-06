package com.mvc.upgrade.biz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.upgrade.model.dao.BoardDao;
import com.mvc.upgrade.model.dto.BoardDto;
@Service
public class BoardBizImpl implements BoardBiz {
	
	@Autowired//(생성 되어있는 bean들을 맞는 메소드에 주입)
	private BoardDao dao;

	@Override
	public List<BoardDto> selectList() {
		
		return dao.selectList();
	}

	@Override
	public BoardDto selectOne(int myno) {
		return dao.selectOne(myno);
	}

	@Override
	public int insert(BoardDto dto) {
		
		return dao.insert(dto);
	}

	@Override
	public int update(BoardDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(int myno) {
		return dao.delete(myno);
	}

	@Transactional
	public String test() {
		
		dao.insert(new BoardDto(0,"transaction","test","insert",null));
		String test=dao.test();
		//insert 후에 exception 발생시킴(일부러) --->null.elength()[예외가 발생함] 
		test.length();
		
		return test;
	}

}
