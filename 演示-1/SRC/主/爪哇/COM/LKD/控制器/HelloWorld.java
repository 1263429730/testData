package com.lkd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//测试git提交
//更新git测试
@RestController
public class HelloWorld {
	
	@RequestMapping("/hello")
	public String showHelloWorld(){		
		return "Hello World";
	}
}
