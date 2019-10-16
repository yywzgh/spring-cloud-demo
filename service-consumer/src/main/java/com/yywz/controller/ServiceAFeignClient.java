package com.yywz.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("client")
public interface ServiceAFeignClient {
	
	@RequestMapping("/hello")
	public String hello();
}
