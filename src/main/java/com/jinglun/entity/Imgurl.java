package com.jinglun.entity;

import java.io.Serializable;

public class Imgurl implements Serializable{
	private Integer imgid;
	private String imgurl;
	private Integer dbid;
	public Integer getImgid() {
		return imgid;
	}
	public void setImgid(Integer imgid) {
		this.imgid = imgid;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public Integer getDbid() {
		return dbid;
	}
	public void setDbid(Integer dbid) {
		this.dbid = dbid;
	}
}
