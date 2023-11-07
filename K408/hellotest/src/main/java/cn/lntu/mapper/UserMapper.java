package cn.lntu.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.lntu.po.User;

@Mapper
public interface UserMapper {
	
	@Select("select * from address where id=#{id}")
	public User getUserById(Integer id);
	
	@Delete("delete from address where id=#{id}")
	public int deleteUserById(Integer id);
	
	@Update("update address set addr=#{addr},count=#{count} where id=#{id}")
	public int updateUserById(User user);
	
	@Insert("insert into address (id,addr,count) values(#{id},#{addr},#{count})")
	public int insertUser(User user);
	
	//其他的数据操作
	
	
	

}
