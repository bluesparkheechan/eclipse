package com.yedam.java.ch0801;

public class SmartTVExample {
	public static void main(String[] args) {
		
		SmartTV smartTv = new SmartTV();
		smartTv.turnOn();
		smartTv.setVolume(10);
		smartTv.search("네이버");
		smartTv.turnOff();
		System.out.println("=====================================");
		//SmartTV = RemoteControl + Searchable + 알파
		RemoteControl rc= smartTv; //Searchable과 알파를 버리는 개념이 됨.
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		Searchable search = smartTv; //RemoteControl과 알파를 버리는 개념.
		search.search("교보문고");
	}
}
