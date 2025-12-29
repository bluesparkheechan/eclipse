package com.yedam.java.ch0701;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//자식 클래스
		DmbCellPhone dcp = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone 클래스로부터 상속 받은 필드
		System.out.println("=======부모가 물려준것이여=======");
		System.out.println("모델: "+ dcp.model);
		System.out.println("색상: "+ dcp.color);
		//CellPhone 클래스로부터 상속 받은 메소드
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("여보세요");
		dcp.receiveVoice("안녕하세요.");
		dcp.sendVoice("반갑습니다!");
		dcp.hangUp();
		dcp.powerOff();
		System.out.println("=======부모가 물려준것이여=======");
		
		//DmbCellPhone 필드
		System.out.println("=======자식이 일군 것이여=======");
		System.out.println("채널: "+dcp.channel);
		//DmbCellPhone 메소드
		dcp.turnOnDmb();
		dcp.chageChannelDmb();
		dcp.turnOffDmb();
		System.out.println("=======자식이 일군 것이여=======");
	}
}
