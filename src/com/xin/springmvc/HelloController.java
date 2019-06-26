package com.xin.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class HelloController {

	
	@RequestMapping(value= "/hello")
	public String hello() {
		
		System.out.println("hello springmvc");
		
		return "ok";
		
	}
	
	
	@RequestMapping("/login")
	public String login() {
		
		System.out.println("欢迎登陆我的世界");
		
		return "success";
		
	}
	
	
}
