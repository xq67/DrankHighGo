package com.jinglun.entity;

import java.io.Serializable;


public class Car implements Serializable{
	private Integer cid;
	private Integer uid;
	private DrankB db;
	private Integer count;
	private Integer addid;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public DrankB getDb() {
		return db;
	}
	public void setDb(DrankB db) {
		this.db = db;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getAddid() {
		return addid;
	}
	public void setAddid(Integer addid) {
		this.addid = addid;
	}
}
