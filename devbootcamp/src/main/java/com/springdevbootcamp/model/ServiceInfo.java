package com.springdevbootcamp.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/*
@Data
@NoArgsConstructor*/
public class ServiceInfo {
	private String name;
	private boolean healthy;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isHealthy() {
		return healthy;
	}
	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}
	@Override
	public String toString() {
		return "ServiceInfo [name=" + name + ", healthy=" + healthy + "]";
	}
	
	
	
	
	
}
