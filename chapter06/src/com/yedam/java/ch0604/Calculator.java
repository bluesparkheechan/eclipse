package com.yedam.java.ch0604;

public class Calculator {
	//필드와 생성자 생략
	
	//메서드 영역(메서드는 반드시 Class 내부에 존재(독립되어 존재하는 경우는 없다.)
	// (기본타입,참조타입 둘다 가능)리턴타입+메서드이름([매개변수,...]){실행블럭}
	// 1. 전원 켜는 기능(그냥 단순 기능임. >> 리턴 값 없음)(딱히 무슨 값을 전달 받을 때만 실행하는게 아님 >> 매개변수x)
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	// 2. 전원 끄는 기능
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	// 3. 더하기(값이 반드시 두개 필요함 > 매개변수 두개 필요 값이 남음(int)
	
	// ㄱ. 배열로 선언
	int plus(int[] values){
		int result = 0;
		for(int value : values) {
			result = result + value;
		};
		//리턴타입이 있을 때는 반드시 리턴하고, 리턴하는 값을 써줘야함
		return result;
	}
	// ㄴ. 가변 파라미터로 선언
	int minus(int ... values) {
		int result = 0;
		for(int val : values) {
			result -= val;
		}return result;
	}
	
	
	// 4. 나누기
	double divide(int x, int y) {
		double result = (double)x/y;
		return result;
	}
}
