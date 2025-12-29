package com.yedam.java.ch0605;

public class mainExample {
	public static void main(String[] args) {
		//정적 멤버 : 인스턴스와 무관하다 ====> new 연산자 없이 사용 가능하다.
		System.out.println("Pi: " + Calculator.pi);
		int result = Calculator.plus(10, 5);
		System.out.println("+ : "+result);
		result = Calculator.minus(10, 5);
		System.out.println("- : "+result);
		
		Calculator cal = new Calculator();
		System.out.println(cal.type);
		System.out.println(cal.pi+" "+ cal.plus(10,5));
	}
}
