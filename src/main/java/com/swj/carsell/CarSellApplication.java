package com.swj.carsell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages="com.swj.carsell.mapper")
public class CarSellApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSellApplication.class, args);
	}

}
