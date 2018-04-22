package com.jinglun.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jinglun.biz.N_adminBiz;
import com.jinglun.entity.Admin;

@Controller
public class AdminController {
	@Resource
	private N_adminBiz n_adminbiz;
	
	//验证管理员登录
	@RequestMapping("/verifyuser.do")
	public String verifyuser(String names,String pwds,HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{	
		Admin admin=n_adminbiz.verifyAdministrator(names, pwds);
		String mes="";
		if(admin!=null){
			request.getSession().setAttribute("users", admin);

			mes= "index";
		}else{
			//request.getRequestDispatcher("login.jsp").forward(request, response);
			mes= "login";
		}
		return mes;

		
		}
	
	@RequestMapping("/index.do")
	public String textJ(){
		return "index";
	}
	@RequestMapping("/deip.do")
	public String textJJ(String data){
		System.out.println("进入跳转！");
		return data;
	}
}

