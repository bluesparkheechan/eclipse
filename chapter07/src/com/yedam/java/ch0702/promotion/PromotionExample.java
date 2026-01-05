package com.yedam.java.ch0702.promotion;

public class PromotionExample {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("Child 타입");
		child.method1(); //Parent-method1()
		child.method2(); //Parent-method2()
		child.method3(); //Child-method3() > 오버라이딩
		child.method4(); //Child-method4() > 자식꺼
		System.out.println();
		
		Parent parent = child;
		//child 인스턴스를 parent인스턴스에 대입하는것과 뭐가다름?
		System.out.println("Parent 타입");
		parent.method1(); //
		parent.method2(); //
		parent.method3(); //
		//클래스의 자동타입변환 : 자식클래스만의 고유 클래스를 사용할 수 없음.
		//parent.method4(); //undefined error >> 부모타입에는 method4()가 없음. ==> 자식이 부모로 자동타입변환하더라도 실제로는 데이터 손실이 생길수도 있다.
		System.out.println();
		parent = new GrandChild();
		System.out.println("GrandChild 타입");
		parent.method1(); //
		parent.method2(); //
		parent.method3(); //
		
		
	}
}
