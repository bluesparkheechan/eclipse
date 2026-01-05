package com.yedam.java.ch0802.field;

public class Car {
	Tire frontLeftTire = new Hankook();
	Tire frontRightTire = new Hankook();
	Tire rearLeftTire = new Kumho();
	Tire rearRightTire = new Kumho();
	
	//메소드
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		rearLeftTire.roll();
		rearRightTire.roll();
	}
}
