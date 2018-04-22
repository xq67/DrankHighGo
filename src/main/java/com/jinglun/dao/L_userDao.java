package com.jinglun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jinglun.entity.Address;
import com.jinglun.entity.Car;
import com.jinglun.entity.User;

public interface L_userDao {
	//验证用户(用户输入用户名或手机号)
	public User validateUser1(@Param("uname")String uname,@Param("upwd")String upwd);
	//验证用户(用户输入用户名或手机号)
	public User validateUser2(@Param("uphone")String uphone,@Param("upwd")String upwd);
	//注册用户
	public int registerUser(@Param("phone")String phone,@Param("pwd")String pwd);
	//获取所有的用户名
	public List<String> getAllNames();
	//加入购物车
	public int addcar(@Param("uid")Integer uid,@Param("dbid")Integer dbid,@Param("dbcount")Integer dbcount);
	//显示用户购物车中的物品
	public List<Car> findCarbdByUid(@Param("uid")Integer uid);
	//dealDo事件0---查询购物车信息
	public Car findcarBycid(@Param("cid")Integer cid);
	//dealDo事件1---生成订单
	public int deal_CreateOverOrder(Car car);
	//dealDo事件2---删除购物车
	public int deal_delCar(@Param("cid")Integer cid);
	//获取用户所有的地址
	public List<Address> findAdd(@Param("uid")Integer uid);
}
