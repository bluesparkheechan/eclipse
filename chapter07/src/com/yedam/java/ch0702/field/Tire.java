package com.yedam.java.ch0702.field;

public class Tire { //부모클래스
	//필드
	public int maxRotation; //  최대 회전수 
	public int accumulatedRoation; // 누적 회전수
	public String location; // 타이어위치
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//메서드
	public boolean roll() {
		++accumulatedRoation; // 회전수 1씩 증가
		if(accumulatedRoation<maxRotation) {
			//현재 누적회전수가 최대 회전수보다 작을 경우 정상주행
			System.out.println(location + "잔여 Tire 수명: "+(maxRotation - accumulatedRoation)+"회");
			return true;
		}else {
			System.out.println("***"+location+" Tire펑크***");
			return false;
		}
	}
}
