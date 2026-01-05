package com.yedam.java.ch0801;

public class SmartTV implements RemoteControl, Searchable {
	private int volume;
	// 생성자

	// 메소드

	@Override
	public void turnOn() {
		System.out.println("TV전원을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV전원을 끕니다.");

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
		System.out.println("TV볼륨: " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
		
	}

}
