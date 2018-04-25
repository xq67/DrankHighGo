package com.jinglun.entity;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable{
	private String uname;
	private String upwd;
	private Integer uid;
	private String uphone;
	private String uemail;
	private String dizhi;
	private Date time;
	private Integer ustatue;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getDizhi() {
		return dizhi;
	}
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getUstatue() {
		return ustatue;
	}
	public void setUstatue(Integer ustatue) {
		this.ustatue = ustatue;
	}
	public User(String uname, String upwd, Integer uid, String uphone, String uemail, String dizhi, Date time,
			Integer ustatue) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.uid = uid;
		this.uphone = uphone;
		this.uemail = uemail;
		this.dizhi = dizhi;
		this.time = time;
		this.ustatue = ustatue;
	}
	public User() {
		super();
	}
	
	
}
