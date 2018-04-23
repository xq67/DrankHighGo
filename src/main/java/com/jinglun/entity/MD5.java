package com.jinglun.entity;

import java.io.Serializable;

public class MD5 implements Serializable{
	private String password;
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public MD5(String password) {
		super();
		this.password = password;
	}

	public MD5() {
		super();
	}
	
	
}
