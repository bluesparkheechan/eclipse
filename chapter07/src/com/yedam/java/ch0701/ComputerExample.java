package com.yedam.java.ch0701;

public class ComputerExample {
	public static void main(String[] args) {
		int r= 10;
		//부모 클래스 기반 인스턴스 생성
		Calculator cal = new Calculator();
		System.out.println("원면적: "+cal.areaCircle(r));
		System.out.println();
		//자식클래스에서 재정의한 메서드 기반 인스턴스 생성
		Computer com = new Computer();
		System.out.println("재정의한 원면적: "+com.areaCircle(r));
	}
}
/* 실행 결과 Calculator 객체의 areaCircle() 실행
원면적: 314.159   >>>>> 자식클래스에서 오버라이딩을 하더라도 부모클래스의 메소드는 변하지 않는다.

Computer 객체의 areaCircle()실행
재정의한 원면적: 314.1592653589793 
*/

/* 컴퓨터의 메소드를 주석처리 하면 부모클래스인 칼큘레이터의 메소드가 호출이된다.
 * Calculator 객체의 areaCircle() 실행
 * 원면적: 314.159
 * Calculator 객체의 areaCircle() 실행	
 * 재정의한 원면적: 314.159
 * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 * 라는것은 해당 메소드가 자식클래스에 있다면 부모클래스에 있는 메소드를 굳이 꺼낼 필요가 없다는 결론이 된다.
 * 동시에 자식 클래스에 해당 메소드가 없다면!!!! 부모클래스에 있는 메소드를 꺼내서 쓴다.
*/

