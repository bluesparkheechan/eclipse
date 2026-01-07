package com.yedam.java.ch1201.annonymous;

//익명구현객체를 활용
public class Annonymous {
	// 필드
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");

		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");

		}

	};

	// 메소드
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다");

			}

			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다");

			}
		};
		localVar.turnOn();
	}
	//매개변수로 익명구현객체 사용
	public void method2(RemoteControl rc) {
		rc.turnOn();
		
	}
}
