package com.yedam.java.ch1201.annonymous;

public class AnnonymousExample {
	public static void main(String[] args) {
		Annonymous anony = new Annonymous();
		//필드(익명객체) 사용
		anony.field.turnOn();
		
		//로컬 변수(익명객체) 사용
		anony.method1();
		
		//매개값(익명객체) 사용
		anony.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("SmartTv를 켭니다.");
				
				
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTv를 끕니다.");
				
			}
			
		});
	}
}
