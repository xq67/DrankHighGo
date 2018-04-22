package com.jinglun.biz.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jinglun.biz.N_adminBiz;
import com.jinglun.dao.N_adminDao;
import com.jinglun.entity.Admin;
@Service
public class N_adminBizImpl implements N_adminBiz{
	@Resource
	private N_adminDao n_admindao;
	@Override
	public Admin verifyAdministrator(String name, String pwd) {
		// TODO Auto-generated method stub
		return n_admindao.verifyAdministrator(name, pwd);
	}

}
