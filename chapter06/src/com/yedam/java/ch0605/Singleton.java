package com.yedam.java.ch0605;

public class Singleton {
	
	//private : 외부에서 접근할 수 없도록 처리
	//1) 자기 자신을 정적 필드로 가짐.
	private final static Singleton singleton = new Singleton();

	//2 외부에서 new 연산자 호출 막음
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		return singleton;
	}
	
}
