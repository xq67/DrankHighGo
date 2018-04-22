package com.jinglun.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinglun.biz.L_userBiz;
import com.jinglun.entity.Address;
import com.jinglun.entity.Car;
import com.jinglun.entity.DrankB;
import com.jinglun.entity.User;

import message.ShortMessage;
@RestController
public class UserController {
	@Resource
	L_userBiz l_userBiz;
	//用户登陆
	@RequestMapping("/userinfo")
	public User userinfo(String uname,String upwd,HttpServletRequest request){
		User user=l_userBiz.validateUser(uname, upwd);
		if(user!=null){
			request.getSession().setAttribute("user", user);
		}
		return user;
	}
	//发送短信验证
	@RequestMapping("/sendMes")
	public String mes(String mobile,HttpServletRequest request){
		String code = (int) (Math.random() * 9000 + 1000) + "";
		/*new ShortMessage().Send(moible, "喝酒就来酒乐go,"
		+"一次选择，喝酒永便 —— 验证码："+code);*/
		request.getSession().setAttribute("code", code);
		System.out.println("---------手机号"+mobile);
		System.out.println(code);
		return code;
	}
	//用户注册
	@RequestMapping("/register")
	public String register(String pwd,String yzm,String phone,HttpServletRequest request){
		String mes="失败";
		String code=(String) request.getSession().getAttribute("code");
		if(!code.equals(yzm)){
			mes="验证码有误";
		}else{
			//执行注册！
			int res=l_userBiz.registerUser(phone, pwd);
			if(res==1){
				mes="成功";
			}
		}
		return mes;
	}
	//判断用户是否登陆
	@RequestMapping("/deuser")
	public String deuser(HttpServletRequest request){
		String mes="nouser";
		User user=(User) request.getSession().getAttribute("user");
		if(user!=null){
			 mes="r";
		}
		return mes;
	}
	//加入购物车
	@RequestMapping("/addCar")
	public Integer addcar(HttpServletRequest request,Integer dbid,Integer dbcount){
		User user=(User) request.getSession().getAttribute("user");
		Integer uid=user.getUid();
		int mes=l_userBiz.addcar(uid, dbid, dbcount);
		return mes;
	}
	//显示购物车中的商品
	@RequestMapping("/showcar")
	public List<Car> showCar(HttpServletRequest request){
		User user=(User) request.getSession().getAttribute("user");
		Integer uid=user.getUid();
		List<Car> list=l_userBiz.findCarbdByUid(uid);
		return list;
	}
	//获取用户地址
	@RequestMapping("/userAddress")
	public List<Address> userAddress(HttpServletRequest request){
		User user=(User) request.getSession().getAttribute("user");
		Integer uid=user.getUid();
		List<Address> list=l_userBiz.findAdd(uid);
		return list;
	}
}
