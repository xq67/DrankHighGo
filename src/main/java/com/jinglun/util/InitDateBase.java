package com.jinglun.util;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jinglun.biz.L_userBiz;
@Component
public class InitDateBase implements CommandLineRunner{
	@Resource
	L_userBiz l_userBiz;
	@Override
	public void run(String... args) throws Exception {
		List<String>names=l_userBiz.getAllNames();
		
		System.out.println(names.size()+"----------获取所有用户名--------------------");
	}

}
