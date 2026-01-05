package com.yedam.java.ch0701;

public class Calculator {
	//부모클래스 영역
	
	//부모메서드 (반환타입, 메소드명(매개변수))
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159*r*r;
	}
}
