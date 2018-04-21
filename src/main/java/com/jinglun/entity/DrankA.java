package com.jinglun.entity;

import java.io.Serializable;

public class DrankA implements Serializable{
	private Integer daid;
	private String daname;
	private String daimgurl;
	private Integer flag;
	public DrankA() {
		super();
	}
	public DrankA(Integer daid, String daname, String daimgurl, Integer flag) {
		super();
		this.daid = daid;
		this.daname = daname;
		this.daimgurl = daimgurl;
		this.flag = flag;
	}
	public Integer getDaid() {
		return daid;
	}
	public void setDaid(Integer daid) {
		this.daid = daid;
	}
	public String getDaname() {
		return daname;
	}
	public void setDaname(String daname) {
		this.daname = daname;
	}
	public String getDaimgurl() {
		return daimgurl;
	}
	public void setDaimgurl(String daimgurl) {
		this.daimgurl = daimgurl;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
}
