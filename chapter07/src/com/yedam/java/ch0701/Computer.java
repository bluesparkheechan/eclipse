package com.yedam.java.ch0701;

public class Computer extends Calculator{
	//자식 클래스 영역
	
	double PI =Math.PI;
	/*double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()실행");
		return PI*r*r;
	}*/
	
	//@어노테이션 : 덧붙이는 기능
	@Override // 컴파일할 때 메소드 오버라이딩을 체크하라는 명령어. => 오버라이딩 기능에 딱히 무슨 변화가 생기는 것은 아니고, 오버라이딩 된 메소드인지 아닌지 구분자역할을 하며, 시그니처 체크역할을 함.
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI*r*r;
	}
}
