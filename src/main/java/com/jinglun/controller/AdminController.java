package com.jinglun.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jinglun.biz.N_adminBiz;
import com.jinglun.entity.Admin;
import com.jinglun.entity.MD5;
import com.jinglun.entity.Page;
import com.jinglun.entity.User;
import com.jinglun.util.InitMD5;

@Controller
public class AdminController {
	@Resource
	private N_adminBiz n_adminbiz;
	InitMD5 m = new InitMD5();

	// 验证管理员登录
	@RequestMapping("/verifyuser.do")
	public String verifyuser(String names, String pwds, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		MD5 m1 = m.toMD5(pwds);
		String pwda = n_adminbiz.ShowPwdByMD5(names);
		String password = m1.getPassword();
		Admin admin = n_adminbiz.verifyAdministrator(names, password);
		String mes = "";
		if (pwda.equals(password)) {
			request.getSession().setAttribute("users", admin);
			mes = "index";
		} else {
			mes = "login";
		}
		return mes;

	}

	@RequestMapping("/deip.do")
	public String textJJ() {
		return "MyJsp";
	}
	
	//分页展示用户信息
	@RequestMapping("/ShowUser.do")
	public ModelAndView ShowUserByName(HttpServletRequest request) throws UnsupportedEncodingException{
		ModelAndView mv=new ModelAndView();
		String pno=request.getParameter("pno");
		String title=request.getParameter("uname");
		if(title!=null){
			title=new String(title.getBytes("iso-8859-1"),"utf-8");
		}
		int p=1;
		if(pno!=null){
			p=Integer.parseInt(pno);
		}
		Page page=n_adminbiz.getPage(title, p);
		mv.addObject("page", page);
		mv.addObject("pno", p);
		mv.setViewName("member-list");
		return mv;
		
	}
}
