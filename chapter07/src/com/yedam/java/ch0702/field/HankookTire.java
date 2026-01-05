package com.yedam.java.ch0702.field;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRoation; // 회전수 1씩 증가
		if(accumulatedRoation<maxRotation) {
			//현재 누적회전수가 최대 회전수보다 작을 경우 정상주행
			System.out.println(location + "잔여 HankookTire 수명: "+(maxRotation - accumulatedRoation)+"회");
			return true;
		}else {
			System.out.println("***"+location+" HankookTire펑크***");
			return false;
		} 
	}
}
