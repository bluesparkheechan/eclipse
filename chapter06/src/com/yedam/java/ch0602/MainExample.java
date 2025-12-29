package com.yedam.java.ch0602;
//실행 클래스 : main 메소드를 포함하고 있는 실행 전용 클래스
public class MainExample {
	public static void main(String[] args) {
		// 객체롤 사용하기 위해서는 인스턴스 필요 => new 연산자
		Car myCar = new Car(); // Car라는 클래스에서 새로운 인스턴스를 (힙영역에)생성한다 >> 그 주소값을 myCar라는 참조타입 변수에 대입한다.
		//Car 타입의 참조 변수 myCar를 선언하고,
		//new를 통해 Car 객체를 생성하면서 Car() 생성자를 호출한 뒤,
		//생성된 객체의 주소를 myCar에 대입한다.
		
		
		//필드 사용: .(dot :도트, 닷)을 통해 접근
		System.out.println("제조사> "+myCar.company);
		System.out.println("모델명> "+myCar.model);
		System.out.println("색상> "+myCar.color);
		System.out.println("최고속도> "+myCar.maxSpeed);
		System.out.println("현재속도> "+myCar.currentSpeed);
		
		//필드값 변경
		myCar.currentSpeed = 60;
		System.out.println("변경된 현재속도> "+myCar.currentSpeed);
	}
}
