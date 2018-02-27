package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DemoController {
	
	@RequestMapping("/login")
	public   String hello()
	{
			System.out.println("Hello world");
			return "index";
	}

}
