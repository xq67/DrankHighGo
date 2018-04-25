package com.jinglun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jinglun.entity.Admin;
import com.jinglun.entity.User;

public interface N_adminDao {
	//验证管理员
	public Admin verifyAdministrator(@Param("name")String name,@Param("pwd") String pwd);
	//验证管理员密码是否与数据库MD5一样
	public String ShowPwdByMD5(@Param("name")String name);
	//显示用户信息
	public int UserCount(@Param("uname")String uname);
	//分页显示
	public List<User>ShowUser(@Param("uname")String uname,@Param("pageno")Integer pageno,@Param("pagesize")Integer pagesize);
	
}
