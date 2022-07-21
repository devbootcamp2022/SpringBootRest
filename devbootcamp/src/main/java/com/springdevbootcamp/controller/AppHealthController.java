package com.springdevbootcamp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdevbootcamp.model.AppHealth;
import com.springdevbootcamp.model.ServiceInfo;

@RestController
@RequestMapping("/api")
public class AppHealthController {
	
	/*
	@GetMapping("/health")
	public String getAppStatus() {
		return "Up and Running";
	}*/
	
	
	
	
	@GetMapping(path = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AppHealth> getAppStatus() {
		AppHealth appHealth = new AppHealth();
		appHealth.setHealthy(true);
		
		//Service-1
		ServiceInfo serviceOne = new ServiceInfo();
		serviceOne.setName("service-1");
		serviceOne.setHealthy(true);
		
		//Service-2
		ServiceInfo serviceTwo = new ServiceInfo();
		serviceTwo.setName("service-2");
		serviceTwo.setHealthy(true);
		
		// Services List
		List<ServiceInfo> servicesList = new ArrayList<>();
		servicesList.add(serviceOne);
		servicesList.add(serviceTwo);
		
		appHealth.setDependencies(servicesList);
		
		return ResponseEntity.ok(appHealth);
	}

}
