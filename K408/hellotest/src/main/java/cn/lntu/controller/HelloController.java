package cn.lntu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.lntu.mapper.UserMapper;
import cn.lntu.mapper.UsersMapper;
import cn.lntu.po.Role;
import cn.lntu.po.User;

@RestController
@RequestMapping("/user")
public class HelloController {

	@Autowired
	private String msg;	
	@Autowired
	private Role role;
	
	//(5)调用
	@Autowired
	private UsersMapper usersMapper;
	
	@Autowired
	private UserMapper userMapper;
	 
	
	@RequestMapping("/")
	public  Object  users() {
		 
		//当前查询users表中全部数据
		/*List<Users> list=usersMapper.findAllUsers();
		
		Users user=usersMapper.findUsersById(32);
		//获取user是否已经被删除？？
		
		System.out.println("user的删除状态标志"+user.getIsdeleted());
		//插入一条数据
		Users temp=new Users();
		temp.setUsername("test1");
		temp.setPassword("test1");		
		usersMapper.addUsers(temp);
		
		//逻辑删除，非物理删除
		usersMapper.delete(1, 34);*/
		//json数据
		User user=userMapper.getUserById(1);
		
		return user;
	}	

	// 思考
	@GetMapping("/hello")
	@ResponseBody
	public Object hello() {
		// 可以编写任意合法的java程序
		// 获取到role.name的值，并输出，？？？？
		return role;
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		// 访问role的属性
		  System.out.println("role="+role);

		return msg;
	}
	
	

}
