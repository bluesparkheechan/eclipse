package com.yedam.java.ch0802.Parameter;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		driver.drive(bus);
		System.out.println();
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}
}
