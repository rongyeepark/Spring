package com.mvc.upgrade.model.dto;

import java.util.Date;

public class BoardDto {
	private int mynum;
	private String myname;
	private String mytitle;
	private String mycontent;
	private Date mydate;

	public BoardDto() {
		super();

	}

	public BoardDto(int mynum, String myname, String mytitle, String mycontent, Date mydate) {
		super();
		this.mynum = mynum;
		this.myname = myname;
		this.mytitle = mytitle;
		this.mycontent = mycontent;
		this.mydate = mydate;
	}

	public int getMynum() {
		return mynum;
	}

	public void setMynum(int mynum) {
		this.mynum = mynum;
	}

	public String getMyname() {
		return myname;
	}

	public void setMyname(String myname) {
		this.myname = myname;
	}

	public String getMytitle() {
		return mytitle;
	}

	public void setMytitle(String mytitle) {
		this.mytitle = mytitle;
	}

	public String getMycontent() {
		return mycontent;
	}

	public void setMycontent(String mycontent) {
		this.mycontent = mycontent;
	}

	public Date getMydate() {
		return mydate;
	}

	public void setMydate(Date mydate) {
		this.mydate = mydate;
	}

}
