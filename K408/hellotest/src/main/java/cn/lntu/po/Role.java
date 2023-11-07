package cn.lntu.po;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
@ConfigurationProperties(prefix = "role")  //suffix
public class Role {
	//@Value("${role.name}")
	private String name;
	
	//@Value("${role.descriptiption}")
	private String descriptiption;
	
	//@Value("${role.permissionIds}")
	private List<Long> permissionIds;	
	
	//此时应该增加setter方法
	public void setName(String name) {
		this.name = name;
	}
	public void setDescriptiption(String descriptiption) {
		this.descriptiption = descriptiption;
	}
	public void setPermissionIds(List<Long> permissionIds) {
		this.permissionIds = permissionIds;
	}	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name="+name+",descriptiption="+descriptiption
				+"permissionIds"+permissionIds;
	}



}
