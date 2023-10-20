package com.springfirstapp;

import org.springframework.beans.factory.annotation.Autowired;

public class VehicleStand {

	
	private Car veh;

	public Car getVeh() {
		return veh;
	}

	@Autowired
	public void setVeh(Car veh) {
		this.veh = veh;
	}
	
	public void standLocation() {
		System.out.println("This is my location of the vehicle stand. I have changed the location recently.");
//		System.out.println("Value of vehicle obj is - " + veh);
	}
}
