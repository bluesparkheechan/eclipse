package com.yedam.java.package3;

public class Car {
	// 필드 => 일반적으로 private로 선언
	private int speed;
	private boolean stop;

	// 생성자

	// 메소드 => getter/setter :: 필드에 접근하는 메소드만 getter setter로 작성하는거임.
	// getter/setter를 제외한 기능에 해당하는 메소드도 존재함.

	// 필드 speed
	public int getSpeed() {

		return this.speed;
	}

	public void setSpeed(int speed) {
		if(speed<0) { // speed는 음수일 수 없음.
			this.speed=0;
			return; //메서드 종료(음수일 때는 speed값을 입력할 수 없도록 종료시키는것.)
		}
	this.speed = speed;
	}
	//필드 stop의 메서드
	public boolean isStop() {
		return this.stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	
	}
}
