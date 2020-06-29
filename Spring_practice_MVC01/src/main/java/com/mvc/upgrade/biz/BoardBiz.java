package com.mvc.upgrade.biz;

import java.util.List;

import com.mvc.upgrade.model.dto.BoardDto;

public interface BoardBiz {

	public List<BoardDto> selectList();
	public BoardDto selectOne(int mynum);
	public int insert(BoardDto dto);
	public int update(BoardDto dto);
	public int delete(int mynum);
}
