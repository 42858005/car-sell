package com.swj.carsell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages="com.swj.carsell.mapper")
public class CarSellApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSellApplication.class, args);
	}

}
