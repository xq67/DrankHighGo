package com.jinglun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TextJsp {
	@RequestMapping("/welcome")
	public String textJ(){
		return "login";
	}
	@RequestMapping("/LeGo.do")
	public String gowelcome(){
		return "MyJsp";
	}
}
