package com.jinglun.dao;

import org.apache.ibatis.annotations.Param;

import com.jinglun.entity.Admin;

public interface N_adminDao {
	//验证管理员
	public Admin verifyAdministrator(@Param("name")String name,@Param("pwd") String pwd);
	
}
