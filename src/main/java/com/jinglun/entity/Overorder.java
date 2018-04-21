package com.jinglun.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Overorder implements Serializable{
	private Integer ooid;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date ootime;
	private User user;      //获取user的id
	private Integer dbid;
	private Integer dbcount;  //后买数量
	private Integer addid;
	public Integer getOoid() {
		return ooid;
	}
	public void setOoid(Integer ooid) {
		this.ooid = ooid;
	}
	public Date getOotime() {
		return ootime;
	}
	public void setOotime(Date ootime) {
		this.ootime = ootime;
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
	public Integer getDbcount() {
		return dbcount;
	}
	public void setDbcount(Integer dbcount) {
		this.dbcount = dbcount;
	}
	public Integer getAddid() {
		return addid;
	}
	public void setAddid(Integer addid) {
		this.addid = addid;
	}
	
}
