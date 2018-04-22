package com.jinglun.entity;

import java.io.Serializable;

public class Address implements Serializable {
	private Integer addid;
	private Integer uid;
	private String addstr;
	public Integer getAddid() {
		return addid;
	}
	public void setAddid(Integer addid) {
		this.addid = addid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getAddstr() {
		return addstr;
	}
	public void setAddstr(String addstr) {
		this.addstr = addstr;
	}
}
