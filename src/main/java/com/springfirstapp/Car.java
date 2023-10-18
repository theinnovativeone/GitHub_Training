package com.springfirstapp;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vehicle{
	
	@Autowired
	private String veh;
	
	@Override
	public String toString() {
		return "veh val: " + veh;
	}
	
	public void drive() {
		System.out.println("There is a car.");
	}
}
