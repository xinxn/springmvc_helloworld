package com.xin.springmvc;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestControlller {
	

	@RequestMapping(value="/testMethod",method=RequestMethod.GET)
	public String testMethod() {
		System.out.println("testMethod。。。。");
		return "ok";
	}
	
	@RequestMapping(value="/testParams",params= {"email","tel!=110"},method=RequestMethod.GET)
	public String testParams() {
		System.out.println("testParams。。。。");
		return "ok";
	}
	
	
	
	
	@RequestMapping(value="/testHeaders",headers= {"Host=localhost:8888"},method=RequestMethod.GET)
	public String testHeaders() {
		System.out.println("testHeaders。。。。");
		return "ok";
	}
	
	@RequestMapping(value="/testAnt/**/**/?",method=RequestMethod.GET)
	public String testAnt() {
		System.out.println("testAnt。。。。");
		return "ok";
	}
	
	@RequestMapping(value="/testPathVar/{uuid1}/hello/{uuid2}",method=RequestMethod.GET)
	public String testPathVar(@PathVariable(value="uuid1") String uuid1,@PathVariable(value="uuid2") String uuid2) {
		System.out.println("testPathVar。。。。uuid1"+uuid1+",uuid2"+uuid2);
		return "ok";
	}
	
	
	@RequestMapping(value="/testPost",method=RequestMethod.POST)
	public String testPost() {
		System.out.println("testPost......");
		return "ok";
	}
	
	
	@RequestMapping(value="/testDelete",method=RequestMethod.DELETE)
	public String testDelete() {
		System.out.println("testDelete......");
		return "ok";
	}
	
	
	@RequestMapping(value="/testPut",method=RequestMethod.PUT)
	public String testPut() {
		System.out.println("testPut......");
		return "ok";
	}
	
	
	@RequestMapping(value="/testGet",method=RequestMethod.GET)
	public String testGet() {
		System.out.println("testGet......");
		return "ok";
	}
	
	
	@RequestMapping(value="/testReqParam",method=RequestMethod.GET)
	public String testReqParam(@RequestParam(value="username",required=false,defaultValue="cyz") String username,
								@RequestParam("password") String password,
								@RequestParam("hobby") List<String> bobbies) {
		System.out.println("testReqParam......");
		System.out.println("username="+username+"，password="+password);
		
		for (String string : bobbies) {
			System.out.println(string);
		}
		return "ok";
	}
	
	
	
	@RequestMapping(value="/testHeader",method=RequestMethod.GET)
	public String testHeader(@RequestHeader(value="User-Agent") String agent) {
		System.out.println("testHeader......"+agent);
		return "ok";
	}
	
	
	@RequestMapping(value="/testCookie",method=RequestMethod.GET)
	public String testCookie(@CookieValue("JSESSIONID") String jsessionId) {
		System.out.println("testCookie......"+jsessionId);
		return "ok";
	}
	
	
	@RequestMapping(value="/testPOJO",method=RequestMethod.POST)
	public String testPOJO(User user) {
		System.out.println("testPOJO......");
		System.out.println(user);
		return "ok";
	}
	
	
	

	
	
	
}
