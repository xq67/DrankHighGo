package com.jinglun.entity;

import java.io.Serializable;

public class DrankB implements Serializable{
	private Integer dbid;          //商品id
	private String dbname;
	private String dbimgurl;
	private String dbbrand;		  //商品品牌
	private Integer stock;        //商品库存
	private Integer deaid;        //商品所属供应商id
	private Integer daid;         //商品父级id
	private Double dbprice;
	private Integer dbpro;         //活动属性
	public DrankB() {
		super();
	}
	
	public DrankB(Integer dbid, String dbname, String dbimgurl, String dbbrand, Integer stock, Integer deaid,
			Integer daid, Double dbprice, Integer dbpro) {
		super();
		this.dbid = dbid;
		this.dbname = dbname;
		this.dbimgurl = dbimgurl;
		this.dbbrand = dbbrand;
		this.stock = stock;
		this.deaid = deaid;
		this.daid = daid;
		this.dbprice = dbprice;
		this.dbpro = dbpro;
	}

	public Integer getDbid() {
		return dbid;
	}
	public void setDbid(Integer dbid) {
		this.dbid = dbid;
	}
	public String getDbname() {
		return dbname;
	}
	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	public String getDbimgurl() {
		return dbimgurl;
	}
	public void setDbimgurl(String dbimgurl) {
		this.dbimgurl = dbimgurl;
	}
	public String getDbbrand() {
		return dbbrand;
	}
	public void setDbbrand(String dbbrand) {
		this.dbbrand = dbbrand;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getDeaid() {
		return deaid;
	}
	public void setDeaid(Integer deaid) {
		this.deaid = deaid;
	}
	public Integer getDaid() {
		return daid;
	}
	public void setDaid(Integer daid) {
		this.daid = daid;
	}
	public Double getDbprice() {
		return dbprice;
	}
	public void setDbprice(Double dbprice) {
		this.dbprice = dbprice;
	}
}
