package cn.lntu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.lntu.po.Users;

//接口，完成类与表之间的ORM

@Mapper  //mybatis中的注解，关键1
public interface UsersMapper {
	
	//查询全部数据
	 @Select("select * from users")
	 public List<Users>  findAllUsers();
	 
	//根据id查询某一个
	@Select("select * from users where id=#{id}")
	public Users findUsersById(int id);
	
	//插入一条数据
	@Insert("insert into users(username,password) values(#{username},#{password})")
	public Integer addUsers(Users user);
	
	//这个很危险（物理删除）,实际中不允许这么操作
	//@Delete("delete from users where id=#{id}")
	
	@Update("update users set isdeleted=#{value} where id=#{id}")
	public Integer delete(int value,int id);
	
	//数据更新
	
	 

}
