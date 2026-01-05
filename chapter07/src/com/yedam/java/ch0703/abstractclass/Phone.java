package com.yedam.java.ch0703.abstractclass;

//추상클래스 => 자기의 인스턴스를 가질 수 없음.
public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	//메소드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
		
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}
