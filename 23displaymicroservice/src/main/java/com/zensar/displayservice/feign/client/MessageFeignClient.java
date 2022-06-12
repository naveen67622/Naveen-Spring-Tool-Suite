package com.zensar.displayservice.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "messageservice")// Hard coding of url is not working 
public interface MessageFeignClient {
	
	@GetMapping("/api/message")
	public String callGenetareMessage();
	}


	
