package com.yi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * 微信小程序后台启动类
 * @author YI
 * @date 2018-6-11 17:32:22
 */
@SpringBootApplication
@MapperScan(basePackages="com.yi.mapper")
@ComponentScan(basePackages= {"com.yi", "org.n3r.idworker"})
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
