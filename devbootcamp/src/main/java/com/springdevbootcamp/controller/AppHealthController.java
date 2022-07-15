package com.springdevbootcamp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppHealthController {
	
	@GetMapping("/health")
	public String getAppStatus() {
		return "Up and Running";
	}
	

}
