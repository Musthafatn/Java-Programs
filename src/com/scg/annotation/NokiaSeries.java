package com.scg.annotation;

@Smartphone(os="Android",version=6)
public class NokiaSeries {
	
	public String model;
	int size;
	
	public NokiaSeries(String model,int size) {
		
		this.model = model;
		this.size=size;
	}

}