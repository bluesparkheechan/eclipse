package com.yedam.java.ch0801;

public interface RemoteControl {
	//상수 >>기본으로 상수처리
	public final static int MAX_VOLUME = 10;
	public int Min_VOLUME=0; // 별도 final, static 키워드가 없어도 상수처리
	
	//추상메소드 => 객체의 사용 방법을 정의.
	public abstract void turnOn();
	public void turnOff(); // 마찬가지로 abstract를 붙이지 않아도 추상메소드 처리.
	public void setVolume(int volume);
}
