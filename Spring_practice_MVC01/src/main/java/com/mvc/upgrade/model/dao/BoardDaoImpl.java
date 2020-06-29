package com.mvc.upgrade.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.dto.BoardDto;
@Repository
public class BoardDaoImpl implements BoardDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<BoardDto> selectList() {
		List<BoardDto> list=new ArrayList<BoardDto>();
		
		try {
			list=sqlSession.selectList(NAMESPACE+"selectList");
		}catch(Exception e) {
			System.out.println("ERROR:selectList");
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public BoardDto selectOne(int mynum) {
		BoardDto res =null;
		try {
			res = sqlSession.selectOne(NAMESPACE+"selectOne",mynum);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int update(BoardDto dto) {
		return 0;
	}

	@Override
	public int insert(BoardDto dto) {
		int res =0;
		try {
		res=sqlSession.insert(NAMESPACE+"insert",dto);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int delete(int mynum) {
		return 0;
	}

}
