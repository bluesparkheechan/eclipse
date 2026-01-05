package com.yedam.java.ch0801;

//인터페이스를 사용할 클래스 => 구현클래스
//implements : 구현관계
public class Television implements RemoteControl {
	// 필드
	private int volume;
	// 생성자

	// 메소드

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.Min_VOLUME) {
			this.volume = RemoteControl.Min_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("볼륨: " + this.volume);
	}

}
