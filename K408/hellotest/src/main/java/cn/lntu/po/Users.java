package cn.lntu.po;

//类名,对应表名，注意类名首字母大写

public class Users {
	
	//分别对应数据库表users中的字段
	private Integer id;
	
	private String username;	
	
	private String password;
	
	private Integer isdeleted;

	//这里应该怎么处理？？？

	
	
	public Integer getId() {
		return id;
	}


	public Integer getIsdeleted() {
		return isdeleted;
	}


	public void setIsdeleted(Integer isdeleted) {
		this.isdeleted = isdeleted;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	

}
