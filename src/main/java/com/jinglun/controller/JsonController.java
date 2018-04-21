package com.jinglun.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinglun.biz.L_pageShowBiz;
import com.jinglun.biz.L_userBiz;
import com.jinglun.entity.DrankB;
import com.jinglun.entity.Overorder;
import com.jinglun.entity.Say;

@RestController
public class JsonController {
	@Resource
	L_pageShowBiz l_pageShowBiz;
	
	@RequestMapping("/pageshow")
	public Map<String, Object> showPage(){
		Map<String, Object> map=l_pageShowBiz.getPageShow();
		return map;
	}
	
	@RequestMapping("/db")//详情页-dbinfo-请求路径
	public Map<String, Object> DbInfo(Integer dbid){
		Map<String, Object> map=l_pageShowBiz.findDBInfoById(dbid);
		return map;
	}
	
	@RequestMapping("/hot")//推荐1或热销2
	public List<DrankB> DbHotInfo(Integer dbpro){
		List<DrankB>list=l_pageShowBiz.findHotDB(dbpro);
		return list;
	}
	@RequestMapping("/classify") //进入分类列表1
	public List<DrankB> ShowWineById(Integer id){
		List<DrankB>list=l_pageShowBiz.findDBByDaid(id);
		return list;
		
	}
	
	@RequestMapping("/getOvero")//获取某个产品所有订单年信息
	 public List<Overorder> getoo(Integer dbid){
		List<Overorder> list=l_pageShowBiz.findAllOvByDbid(dbid);
		return list;
	 }
	
	@RequestMapping("/getSay")//获取某个产品所有评论信息
	 public List<Say> getsay(Integer dbid){
		List<Say> list=l_pageShowBiz.findAllSayByDbid(dbid);
		return list;
	 }
	@RequestMapping("/search")//模糊查询
	public List<DrankB> Dbsearch(String dblike){
		List<DrankB>list=l_pageShowBiz.findlikedb(dblike);
		return list;
	}

	@RequestMapping("/recommend")	//显示推荐(销量好的)
	public List<DrankB> ShowrecommendByTop(){
		List<DrankB>list=l_pageShowBiz.findCommodityByTop();
		return list;		
	}
	@RequestMapping("/new")
	public List<DrankB>ShowCommodity(){		
		List<DrankB>list=l_pageShowBiz.findCommodityByLater();
		return list;
	}
	@RequestMapping("/sales")
	public List<DrankB>findlikebyTop(String dblike){
		List<DrankB>list=l_pageShowBiz.findlikebyTop(dblike);
		return list;
		
	}
	@RequestMapping("/dbprice")
	public List<DrankB>findlikebydbprice(String dblike,Integer num){
		String order="asc";
		if(num%2==0){
			order="desc";
		}
		List<DrankB>list=l_pageShowBiz.findlikebymoney(dblike, order);	
		return list;
		
	}

	

}
