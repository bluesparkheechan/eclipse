package com.yedam.java.ch0605;

public class Car {
	// 필드
	int speed;

	// 실행자

	// 메서드
	void run() {
		System.out.println("시속 "+speed+"Km/h" + "으로 질주하는중");
		
		testMethod();
	}

	static void testMethod() {}

	// 정적 메서드
	public static void main(String[] args) {
		// 정적 메서드 내부에서는 인스턴스 멤버 그 어느것도 호출이 불가능하다.
		
		//만약 사용하고싶으면 정적 메서드 내부에 인스턴스를 호출한 뒤 사용해야한다. >> 평소에 main에 하던짓이랑 같음
		Car car = new Car();
		car.speed = 150;
		car.run();
		
		// 정적 메서드는 상관없음
		testMethod();
	}
}
