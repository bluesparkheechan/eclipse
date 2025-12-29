package com.yedam.java.ch0603;

public class MainExample {
	public static void main(String[] args) {
		//생성자 호출 및 객체 생성
		Car hongCar = new Car("캐스퍼", "초록");
		System.out.println("hongCar=============================");
		System.out.println("제조사: "+hongCar.company);
		System.out.println("모델: " +hongCar.model);
		System.out.println("색상: "+hongCar.color	);
		Car kangCar = new Car("메기소나타", "흰색");
		System.out.println("kangCar=============================");
		System.out.println("제조사: "+kangCar.company);
		System.out.println("모델: " +kangCar.model);
		System.out.println("색상: "+kangCar.color	);	
		
		Car leeCar = new Car("기아자동차", "레이", "파랑");
		System.out.println("leeCar=============================");
		System.out.println("제조사: "+leeCar.company);
		System.out.println("모델: " +leeCar.model);
		System.out.println("색상: "+leeCar.color	);	
	
		Member me = new Member("박희찬","myId");
		System.out.println("이름: "+me.name);
		System.out.println("아이다: "+me.id);
		
	}
	
}
