package com.jinglun.biz;

import org.apache.ibatis.annotations.Param;

import com.jinglun.entity.Admin;

public interface N_adminBiz {
	//验证管理员登录信息
	public Admin verifyAdministrator(String name, String pwd);
}
