package com.jinglun.dao;

import org.apache.ibatis.annotations.Param;

import com.jinglun.entity.Admin;

public interface N_adminDao {
	//验证管理员
	public Admin verifyAdministrator(@Param("name")String name,@Param("pwd") String pwd);
	//验证管理员密码是否与数据库MD5一样
	public String ShowPwdByMD5(@Param("name")String name);
	
}
