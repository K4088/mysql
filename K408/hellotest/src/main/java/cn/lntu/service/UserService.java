package cn.lntu.service;

import cn.lntu.po.User;

public interface UserService {
	
	public User getUserById(int id);
	
	public int deleteUserById(int id);

	public int updateUserById(User user);
	
	public int insertUser(User user);
	
}
