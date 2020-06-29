package com.mvc.upgrade.model.dao;

import java.util.List;

import com.mvc.upgrade.model.dto.BoardDto;

public interface BoardDao {
	
	String NAMESPACE="board.";
	
	public List<BoardDto> selectList();
	public BoardDto selectOne(int mynum);
	public int update(BoardDto dto);
	public int insert(BoardDto dto);
	public int delete(int mynum);

}
