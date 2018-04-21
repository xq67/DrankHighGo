package com.jinglun.entity;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable{
	private String uname;
	private String upwd;
	private Integer uid;
	private String uphone;
	private String uimg;
	private Date createtime;
	private Integer ustatue;
	
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getUimg() {
		return uimg;
	}
	public void setUimg(String uimg) {
		this.uimg = uimg;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Integer getUstatue() {
		return ustatue;
	}
	public void setUstatue(Integer ustatue) {
		this.ustatue = ustatue;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	
}
