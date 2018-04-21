package com.jinglun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jinglun.entity.Dealer;
import com.jinglun.entity.DrankA;
import com.jinglun.entity.DrankB;
import com.jinglun.entity.Imgurl;
import com.jinglun.entity.Notice;
import com.jinglun.entity.Overorder;
import com.jinglun.entity.Say;
import com.jinglun.entity.User;

public interface PageMapper {
	List<Dealer> findAllDea();  //获取所有的供应商信息
	
	List<DrankA> findAllDra();  //获取所有的a级目录
	
	List<DrankB> findAllDrb();  //获取前10条商品
	List<Notice> findNotice();  //获取前3条公告
	public DrankB findDrankBById(@Param("dbId")Integer id); //通过id获取DrankB信息
	public List<Imgurl> findDbImgById(@Param("id")Integer id); //通过id获取DrankB下图片信息
	//获取热销产品1,//获取推荐产品2
	public List<DrankB> findHotDB(@Param("id")Integer dbpro);
	//通过daid获取db
	public List<DrankB> findDBByDaid(@Param("id")Integer daid);
	//获取某商品的订单信息
	public List<Overorder> findAllOvByDbid(@Param("id")Integer dbid);
	//获取某个商品的评论信息
	public List<Say> findAllSayByDbid(@Param("id")Integer dbid);
	//获取某个商品的销量
	public int findDbsellCount(@Param("id")Integer dbid);
	//模糊查询db
	public List<DrankB> findlikedb(@Param("dblike")String dblike);
	//推荐(库存少的销量大)
	public List<DrankB>findCommodityByTop();
	//新品推荐(根据id后面的为新上架的)
	public List<DrankB>findCommodityByLater();
	//搜索完销量排序
	public List<DrankB> findlikebyTop(@Param("dblike")String dblike);
	//根据价格排序
	public List<DrankB> findlikebymoney(@Param("dblike")String dblike,@Param("order")String order);
	


}
