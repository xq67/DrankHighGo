package com.jinglun.biz;

import java.util.List;

import com.jinglun.entity.Address;
import com.jinglun.entity.Car;
import com.jinglun.entity.User;

public interface L_userBiz {
	//获取所有的用户名
	public List<String> getAllNames();
	//验证用户(用户输入用户名或手机号)
	public User validateUser(String uname,String upwd);
	//注册用户
	public int registerUser(String phone,String pwd);
	//加入购物车
	public int addcar(Integer uid,Integer dbid,Integer dbcount);
	//显示用户购物车中的物品
	public List<Car> findCarbdByUid(Integer uid);
	// 1.删除购物车相关数据 2.生成订单
	public int addDeal(List<Integer> cids);
	//获取用户所有的地址
	public List<Address> findAdd(Integer uid);
}
