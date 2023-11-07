package cn.lntu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class HelloController2 {
	
	//此处获得role.name，？？？？
	
	private String roleName;
	
	//思考
	@GetMapping("/hello")
	public String hello() {
		//可以编写任意合法的java程序
		
		return "hello,admin,Spring Boot!";
	}
	
	@RequestMapping(value="/test",method = RequestMethod.GET)
	public String test() {
		System.out.println("test11111");
		return "study Spring boot11111";
	}
	
	
	

}
