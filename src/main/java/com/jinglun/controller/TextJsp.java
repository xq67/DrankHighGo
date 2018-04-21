package com.jinglun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TextJsp {
	@RequestMapping("/textj")
	public String textJ(){
		return "MyJsp";
	}
	
}
