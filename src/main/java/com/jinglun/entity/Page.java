package com.jinglun.entity;

import java.util.ArrayList;
import java.util.List;



public class Page {
	private int currentpage=1;	//当前页码
	private int pagesize=5;		//每页五条
	private int count;			//一共多少条数据
	private int pagenum;		//一共多少页
	private String uname;	//搜索框
	private List<User>currentDate=new ArrayList<User>();
	public int getCurrentpage() {
		return currentpage;
	}
	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPagenum() {
		return pagenum;
	}
	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public List<User> getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(List<User> currentDate) {
		this.currentDate = currentDate;
	}
	public Page(int currentpage, int pagesize, int count, int pagenum, String uname, List<User> currentDate) {
		super();
		this.currentpage = currentpage;
		this.pagesize = pagesize;
		this.count = count;
		this.pagenum = pagenum;
		this.uname = uname;
		this.currentDate = currentDate;
	}
	public Page() {
		super();
	}
	
	
}
