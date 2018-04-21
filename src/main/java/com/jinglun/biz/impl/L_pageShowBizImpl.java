package com.jinglun.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jinglun.biz.L_pageShowBiz;
import com.jinglun.dao.PageMapper;
import com.jinglun.entity.Dealer;
import com.jinglun.entity.DrankA;
import com.jinglun.entity.DrankB;
import com.jinglun.entity.Imgurl;
import com.jinglun.entity.Notice;
import com.jinglun.entity.Overorder;
import com.jinglun.entity.Say;
@Service
public class L_pageShowBizImpl implements L_pageShowBiz {
	@Resource
	private PageMapper pageMapper;
	@Override
	public Map<String, Object> getPageShow() {
		List<Dealer> list=pageMapper.findAllDea();
		List<DrankA> list1=pageMapper.findAllDra();
		List<DrankB> list2=pageMapper.findAllDrb();
		List<Notice> list3=pageMapper.findNotice();
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("dea", list);
		map.put("dra", list1);
		map.put("drb", list2);
		map.put("notice", list3);
		return map;
	}
	
	@Override
	public Map<String, Object> findDBInfoById(Integer id) {
		DrankB db=pageMapper.findDrankBById(id);
		List<Imgurl> list=pageMapper.findDbImgById(id);
		int sell=pageMapper.findDbsellCount(id);
		Map<String, Object>map=new HashMap<String, Object>();
		map.put("dbInfo", db);
		map.put("imglist", list);
		map.put("sellCount", sell);
		return map;
	}

	@Override
	public List<DrankB> findHotDB(Integer dbpro) {
		// TODO Auto-generated method stub
		return pageMapper.findHotDB(dbpro);
	}

	@Override
	public List<DrankB> findDBByDaid(Integer daid) {
		// TODO Auto-generated method stub
		return pageMapper.findDBByDaid(daid);
	}

	@Override
	public List<Overorder> findAllOvByDbid(Integer dbid) {
		// TODO Auto-generated method stub
		return pageMapper.findAllOvByDbid(dbid);
	}

	@Override
	public List<Say> findAllSayByDbid(Integer dbid) {
		// TODO Auto-generated method stub
		return pageMapper.findAllSayByDbid(dbid);
	}

	@Override
	public List<DrankB> findlikedb(String dblike) {
		// TODO Auto-generated method stub
		return pageMapper.findlikedb(dblike);
	}

	@Override
	public List<DrankB> findCommodityByTop() {
		// TODO Auto-generated method stub
		return pageMapper.findCommodityByTop();
	}

	@Override
	public List<DrankB> findCommodityByLater() {
		// TODO Auto-generated method stub
		return pageMapper.findCommodityByLater();
	}

	@Override
	public List<DrankB> findlikebyTop(String dblike) {
		// TODO Auto-generated method stub
		return pageMapper.findlikebyTop(dblike);
	}

	@Override
	public List<DrankB> findlikebymoney(String dblike, String order) {
		// TODO Auto-generated method stub
		return pageMapper.findlikebymoney(dblike, order);
	}


	

}
