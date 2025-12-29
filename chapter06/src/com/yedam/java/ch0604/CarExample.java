package com.yedam.java.ch0604;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTurnOn(); // 시동
		myCar.run(); // 운전중
		int speed = myCar.getSpeed();
		System.out.println("현재속도: "+speed+"km/h");
		
		Car superCar = new Car();
		superCar.keyTurnOn(); // 시동
		superCar.run(); // 운전중
		speed = superCar.getSpeed();
		System.out.println("현재속도: "+speed+"km/h");
	}
}
