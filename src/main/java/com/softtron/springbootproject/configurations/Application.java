package com.softtron.springbootproject.configurations;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//springboot开启自动装配
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.softtron.springbootproject"})
@MapperScan(basePackages = {"com.softtron.springbootproject"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
