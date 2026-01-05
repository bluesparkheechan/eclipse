package com.yedam.java.ch0703;
//부모클래스
//추상클래스 : 클래스를 만들 때 정의할 공통사항(필드, 메소드)을 포함한 클래스
public abstract class Animal {
	//필드
	public String kind;
	//생성자
	
	// 매서드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	// 추상메서드 : 일반 메서드와 달리 실행블록이 없음.
	// 전제조건이 메소드 override이기 때문에. 추상메소드가 있는 클래스에 extend하게되면 강제성을 띔. 무조건 오버라이드 해야함.
	public abstract void  sound();
}
