package com.springboot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class api1 {
	
	@GetMapping("/hello")
	public String getword() {
		return "how are you";	
	}


}
