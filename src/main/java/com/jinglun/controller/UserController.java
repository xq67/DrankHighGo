package com.jinglun.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.neo4j.cypher.internal.compiler.v2_1.docbuilders.internalDocBuilder;
import org.springframework.web.bind.annotation.PathVariable;
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
	//用户交易商品年
	@RequestMapping("/deal")
	public String dealDo(HttpServletRequest request,Integer addid){
		String mes="交易失败！";
		System.out.println("进入交易请求");
		String newAdd=request.getParameter("newAdd");
		String cidxs=request.getParameter("list");
		String[] cids=cidxs.split(",");
		String conPhone=request.getParameter("conPhone");
		List<Integer>list=new ArrayList<Integer>();
		User user=(User) request.getSession().getAttribute("user");
		try {
			Integer uid=user.getUid();
			for (String cid : cids) {
				Integer x=Integer.parseInt(cid);
				list.add(x);
			}
			if((addid!=0)&&(newAdd=="")){//使用的旧地址，和电话插入购物车
				l_userBiz.updateCar(addid, conPhone, list);
			}else if(newAdd!=""){//使用新地址，并拿到addid，将新的addid和电话插入购物车
				int newAddid=l_userBiz.addAddstr(newAdd, uid);
				l_userBiz.updateCar(newAddid, conPhone, list);
			}
			int num=l_userBiz.addDeal(list);
			if(num==1){
				mes="1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mes;
	}
}
