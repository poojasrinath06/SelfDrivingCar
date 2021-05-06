package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@Component
@RestController
public class SelfDrivingCar implements Car {
	
	private String id;
    private String model;
    @Autowired
    private Registration reg;
    @Autowired
    private Location loc;
    
    @GetMapping("/start")
	@Override
	public void start() {
    	
		System.out.println("car is starting... ");
		
	}

	@PostMapping("/start/addSpeed")
	@Override
	public void turnSpeed(double speed) {
	   System.out.println("Setting the speed to.. "+speed +" with registration number " + reg.getStateName() +reg.getDisNum()+reg.getAlpha()+reg.getNum());
	 
		
	}
	@GetMapping("/turn")
	@Override
	public void turn() {
		System.out.println("car is taking a turn");
		loc.locate();
		
	}
    
	@GetMapping("/stop")
	@Override
	public void stop() {
		System.out.println("Car is stopping");
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public Registration getReg() {
		return reg;
	}


	public void setReg(Registration reg) {
		this.reg = reg;
	}


	public Location getLoc() {
		return loc;
	}


	public void setLoc(Location loc) {
		this.loc = loc;
	}


	public SelfDrivingCar(Registration reg, Location loc) {
		super();
		this.reg = reg;
		this.loc = loc;
	}
	
}
