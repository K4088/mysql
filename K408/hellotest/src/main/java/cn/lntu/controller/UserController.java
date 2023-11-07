package cn.lntu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.lntu.po.User;
import cn.lntu.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//其他的业务
	
	@RequestMapping("/getUserById/{id}")  //路径参数
	public User  getUserById(@PathVariable("id") Integer id) {
		
		//根据id去查询相应的user数据
		System.out.println("id="+id);
		
		User user=userService.getUserById(id);
		
		return user;
	}
	
	@RequestMapping("/deleteUserById/{id}")
	public Object deleteUserById(@PathVariable("id") Integer id) {
		int num=userService.deleteUserById(id);
		return num;
	}
	
	@RequestMapping("/updateUserById/{id}/{addr}/{count}")
	public String updateUserById(@PathVariable("id") Integer id,@PathVariable("addr") String addr,@PathVariable("count") int count) {
		User user0 = new User();
		user0.setId(id);
		user0.setAddr(addr);
		user0.setCount(count);
		userService.updateUserById(user0);
		System.out.println("操作成功");
		return "操作成功";
		
	}
	
	@RequestMapping("/insertUser/{id}/{addr}/{count}")
	public String insertUser(@PathVariable("id") Integer id,@PathVariable("addr") String addr,@PathVariable("count") int count) {
		User user1 = new User();
		user1.setId(id);
		user1.setAddr(addr);
		user1.setCount(count);
		userService.insertUser(user1);
		System.out.println("操作成功");
		return "操作成功";
	}
		
		
		
		
		
		
}
