package com.yedam.java.ch0702.parameter;

public class DriveExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Taxi());
		driver.drive(new Bus());
	}
}
