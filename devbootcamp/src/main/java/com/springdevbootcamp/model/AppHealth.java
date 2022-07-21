package com.springdevbootcamp.model;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
@Data
@NoArgsConstructor*/
public class AppHealth {
	private boolean healthy;
	private List<ServiceInfo> dependencies;
	
	public boolean isHealthy() {
		return healthy;
	}
	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}
	public List<ServiceInfo> getDependencies() {
		return dependencies;
	}
	public void setDependencies(List<ServiceInfo> dependencies) {
		this.dependencies = dependencies;
	}
	
	
	
	
	
	
}
