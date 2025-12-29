package com.yedam.java.ch0701;

// 자식 클래스 : Cellphone(부모클래스)의 기능 + DMB기능
public class DmbCellPhone extends CellPhone {
	//extends(상속) : 부모클래스의 멤버를 사용할 수 있음.
	//필드
	int channel;
	//생성자
	DmbCellPhone(String model, String color, int channel){
		super(model,color);//부모생성자가 기본생성자일경우 생략가능 // 부모생성자가 기본생성자가 아닐 경우 부모생성자를 호출해야함 => 무조건 첫번째줄.
		this.model = model;
		this.color = color;
		this.channel=channel;
		System.out.println("DmbCellPhone 인스턴스생성");
	}
	//메소드
	void turnOnDmb() {
		System.out.println("채널 "+this.channel+"번 DMB방송 수신 시작합니다.");
		
	}
	void chageChannelDmb() {
		System.out.println("채널 "+this.channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("티비꺼라");
	}
}
