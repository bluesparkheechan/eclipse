package com.yedam.java.ch0702.casting;

public class CastingExample {
	public static void main(String[] args) {
		Parent p = new Parent();
		// 변수 instanceof 이용하려는 클래스명
		if (p instanceof Child) {
			Child c = (Child) p;
			c.method1();
			c.method2();
			c.method3();
			c.method4();

		}else {
			System.out.println("해당 인스턴스는 Child 객체가 아닙니다.");
		}
		
		//실제로 강제 타입 변환을 사용하는 경우
		Child child = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();
		//=> 자식클래스의 고유 멤버를 써야하는 경우
		child = (Child)parent;
		
		if(parent instanceof Child) {
			child = (Child)parent;
			child.method3();
		}else {
			System.out.println("해당 인스턴스는 Child객체가 아닙니다.");
		}
	}
}
