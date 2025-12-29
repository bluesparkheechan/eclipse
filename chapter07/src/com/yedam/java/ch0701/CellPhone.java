package com.yedam.java.ch0701;

//부모클래스
public class CellPhone {
	//필드
	String model;
	String color;
	//생성자
	public CellPhone(String model, String color){
		this.model = model;
		this.color = color;
		System.out.println("CellPhone 인스턴스생성");
	}
	//메소드
	void powerOn() {
		System.out.println("전원ON");
		
	}
	void powerOff() {
		System.out.println("전원OFF");
	}
	void bell() {
		System.out.println("전화왔다임마");
		
	}
	void sendVoice(String message) {
		System.out.println("나: "+ message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방: "+message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
