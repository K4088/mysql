package cn.lntu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//关键2
@MapperScan("cn.lntu.mapper")
public class Main {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Main.class, args);
	}


}
