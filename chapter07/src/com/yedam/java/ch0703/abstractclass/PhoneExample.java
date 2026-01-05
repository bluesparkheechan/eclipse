package com.yedam.java.ch0703.abstractclass;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone p = new Phone("홍길동"); // 추상클래스는 스스로의 인스턴스를 생성할 수 없다.(컴파일에러)
		SmartPhone sp = new SmartPhone("김현태");
		
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
		
	} 
}
