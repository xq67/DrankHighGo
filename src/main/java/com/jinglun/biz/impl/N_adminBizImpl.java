package com.jinglun.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jinglun.biz.N_adminBiz;
import com.jinglun.dao.N_adminDao;
import com.jinglun.entity.Admin;
import com.jinglun.entity.Page;
import com.jinglun.entity.User;
@Service
public class N_adminBizImpl implements N_adminBiz{
	@Resource
	private N_adminDao n_admindao;
	@Override
	public Admin verifyAdministrator(String name, String pwd) {
		// TODO Auto-generated method stub
		return n_admindao.verifyAdministrator(name, pwd);
	}
	@Override
	public String ShowPwdByMD5(String name) {
		// TODO Auto-generated method stub
		return n_admindao.ShowPwdByMD5(name);
	}
	@Override
	public int UserCount(String uname) {
		// TODO Auto-generated method stub
		return n_admindao.UserCount(uname);
	}
	@Override
	public List<User> ShowUser(String uname, Integer pageno, Integer pagesize) {
		// TODO Auto-generated method stub
		int from=(pageno-1)*pagesize;
		return n_admindao.ShowUser(uname, from, pagesize);
	}
	@Override
	public Page getPage(String uname, Integer pno) {
		Page p=new Page();
		p.setCurrentpage(pno);
		p.setUname(uname);
		p.setCount(UserCount(uname));
		int num=p.getCount()%p.getPagesize()>0?
				p.getCount()/p.getPagesize()+1:p.getCount()/p.getPagesize();//分页  一共多少页
		p.setPagenum(num);
		p.setCurrentDate(ShowUser(p.getUname(),p.getCurrentpage(),p.getPagesize()));
		return p;
	}

}
