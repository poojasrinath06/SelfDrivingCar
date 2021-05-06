package com.test.demo;

import org.springframework.stereotype.Component;

@Component
public class Location {
  
	private double latitude;
	private double longitude;
	
	@Override
	public String toString() {
		return "Location [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	public Location()
	{
		System.out.println("in no arg constructor of location");
	}

	public Location(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public void locate()
	{
		//calculation part is done here
		System.out.println("your location is....");
		///based on the calculation using gmaps
		
	}
	
	
}
