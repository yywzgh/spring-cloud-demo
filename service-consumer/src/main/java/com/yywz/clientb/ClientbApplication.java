package com.yywz.clientb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.yywz.controller"}) 
@ComponentScan(basePackages = {"com.yywz.controller"}) 
public class ClientbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientbApplication.class, args);
	}

}
