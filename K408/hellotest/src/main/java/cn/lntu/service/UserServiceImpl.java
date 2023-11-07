package cn.lntu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lntu.mapper.UserMapper;
import cn.lntu.mapper.UsersMapper;
import cn.lntu.po.User;

//业务层
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
//	@Autowired
//	private UsersMapper usersMapper;
//	
	
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		User user=userMapper.getUserById(id);
		//其他数据
		
		//数据处理
		
		//把数据传递过去
		
		
		return user;
	}
	@Override
	public int deleteUserById(int id) {
		// TODO Auto-generated method stub
		return  userMapper.deleteUserById(id);
	}
	
	@Override
	public int updateUserById(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUserById(user);
	}
	
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}
	
}
