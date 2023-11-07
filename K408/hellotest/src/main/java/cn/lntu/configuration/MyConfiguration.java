package cn.lntu.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.lntu.po.Role;

@Configuration
public class MyConfiguration {

	@Bean
	public String msg() {
		return "这是配置类中的返回信息";
	}
	
	@Bean
	public Role myRole() {
		return new Role();
	}
}
