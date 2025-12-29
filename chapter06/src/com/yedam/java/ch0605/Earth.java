package com.yedam.java.ch0605;

public class Earth {
	// 상수 : 불변성을 가진 데이터 => 기본타입만 가능하다.
	// 상수는 대부분 정적 필드의 final을 말한다.
	// 관례적으로 상수의 이름은 대문자를 사용.+스네이크표기법.
	static final double EARTH_RADIUS = 6400;
	final static double EARTH_AREA = 4*Math.PI * EARTH_RADIUS;
	
	// 인스턴스 필드 + final => 인스턴스 별로 고정값을 가져야 하는 경우
	final String name;
	Earth(String name){
		this.name = name;
	}
}
