package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	@Autowired
	Apps app; 
	
	public void compile() {
		
		app.java();
		
	}

}