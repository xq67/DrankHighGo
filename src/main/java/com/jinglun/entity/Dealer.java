package com.jinglun.entity;

import java.io.Serializable;

public class Dealer implements Serializable {
	private Integer deaid;          //供应商id
	private String deaname;
	private String idcard;
	private String deaphone;
	private String deaaddress;    //供应商地址
	private Integer dearank;       //供应商等级
	private Double deaMoney;
	public Dealer() {
		super();
	}
	
	public int getDeaid() {
		return deaid;
	}
	public void setDeaid(int deaid) {
		this.deaid = deaid;
	}
	public String getDeaname() {
		return deaname;
	}
	public void setDeaname(String deaname) {
		this.deaname = deaname;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getDeaphone() {
		return deaphone;
	}
	public void setDeaphone(String deaphone) {
		this.deaphone = deaphone;
	}
	public String getDeaaddress() {
		return deaaddress;
	}
	public void setDeaaddress(String deaaddress) {
		this.deaaddress = deaaddress;
	}

	public Integer getDearank() {
		return dearank;
	}

	public void setDearank(Integer dearank) {
		this.dearank = dearank;
	}

	public Double getDeaMoney() {
		return deaMoney;
	}

	public void setDeaMoney(Double deaMoney) {
		this.deaMoney = deaMoney;
	}

	public void setDeaid(Integer deaid) {
		this.deaid = deaid;
	}

	public Dealer(Integer deaid, String deaname, String idcard, String deaphone, String deaaddress, Integer dearank,
			Double deaMoney) {
		super();
		this.deaid = deaid;
		this.deaname = deaname;
		this.idcard = idcard;
		this.deaphone = deaphone;
		this.deaaddress = deaaddress;
		this.dearank = dearank;
		this.deaMoney = deaMoney;
	}
	   
}
