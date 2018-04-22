package com.jinglun.entity;

import java.io.Serializable;

public class Admin implements Serializable {
	private Integer adminid;
	private String name;
	private String pwd;
	public Integer getAdminid() {
		return adminid;
	}
	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Admin(Integer adminid, String name, String pwd) {
		super();
		this.adminid = adminid;
		this.name = name;
		this.pwd = pwd;
	}
	public Admin() {
		super();
	}
	
}
