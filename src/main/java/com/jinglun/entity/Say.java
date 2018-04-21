package com.jinglun.entity;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Say implements Serializable{
	private Integer sayid;
	private String saycontent;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date time;
	private User user;
	private Integer dbid;
	public Integer getSayid() {
		return sayid;
	}
	public void setSayid(Integer sayid) {
		this.sayid = sayid;
	}
	public String getSaycontent() {
		return saycontent;
	}
	public void setSaycontent(String saycontent) {
		this.saycontent = saycontent;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getDbid() {
		return dbid;
	}
	public void setDbid(Integer dbid) {
		this.dbid = dbid;
	}
}
