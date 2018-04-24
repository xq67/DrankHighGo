package com.jinglun.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jinglun.biz.L_userBiz;
import com.jinglun.dao.L_userDao;
import com.jinglun.entity.Address;
import com.jinglun.entity.Car;
import com.jinglun.entity.User;
@Service
public class L_userBizImpl implements L_userBiz {
	@Resource
	L_userDao l_userDao;
	@Override
	public List<String> getAllNames() {
		// TODO Auto-generated method stub
		return l_userDao.getAllNames();
	}

	@Override
	public User validateUser(String uxx, String upwd) {
		User user=null;
		user=l_userDao.validateUser1(uxx, upwd);    //名字匹配
		if(user==null){
			user=l_userDao.validateUser2(uxx, upwd);
		}
		return user;
	}

	@Override
	public int registerUser(String phone,String pwd) {
		// TODO Auto-generated method stub
		return l_userDao.registerUser(phone, pwd);
	}

	@Override
	public int addcar(Integer uid, Integer dbid, Integer dbcount) {
		// TODO Auto-generated method stub
		return l_userDao.addcar(uid, dbid, dbcount);
	}

	@Override
	public List<Car> findCarbdByUid(Integer uid) {
		// TODO Auto-generated method stub
		return l_userDao.findCarbdByUid(uid);
	}

	@Override
	public int addDeal(List<Integer> cids) {
		int o=0,c=0,mes=0;
		String onum=System.currentTimeMillis()+"";
		for (Integer cid : cids) {
			//查询购物车信息
			Car car=l_userDao.findcarBycid(cid);
			//创建订单
			o+=l_userDao.deal_CreateOverOrder(car,onum);
			//删除购物车信息
			c+=l_userDao.deal_delCar(cid);
		}
		if((o+c)==(2*cids.size())){
			mes=1;
		}
		return mes;
	}

	@Override
	public List<Address> findAdd(Integer uid) {
		// TODO Auto-generated method stub
		return l_userDao.findAdd(uid);
	}

	@Override
	public int updateCar(Integer addid, String phone,List<Integer> cids) {
		int mes=0;
		for (Integer cid : cids) {
			mes+=l_userDao.updateCar(addid, phone, cid);
		}
		if(mes==cids.size()){mes=1;}
		return mes;
	}

	@Override
	public int addAddstr(String addstr, Integer uid) {
		l_userDao.addAddstr(addstr, uid);    //将新地址插入地址表
		int addid=l_userDao.findaddid(addstr, uid); //返回新地址的id
		return addid;
	}

	

	

}
