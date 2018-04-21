package com.jinglun.entity;

import java.io.Serializable;
import java.sql.Date;

public class Notice implements Serializable{
	private Integer nocid;
	private String notcontent;
	private Date nottime;
	public Integer getNocid() {
		return nocid;
	}
	public void setNocid(Integer nocid) {
		this.nocid = nocid;
	}
	public String getNotcontent() {
		return notcontent;
	}
	public void setNotcontent(String notcontent) {
		this.notcontent = notcontent;
	}
	public Date getNottime() {
		return nottime;
	}
	public void setNottime(Date nottime) {
		this.nottime = nottime;
	}
}
