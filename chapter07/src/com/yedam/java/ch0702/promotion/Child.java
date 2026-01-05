package com.yedam.java.ch0702.promotion;

public class Child extends Parent{
	//Parent 영역으로 확장한 Child
	@Override
	public void method3() {
		System.out.println("Child-method3()");
	}
	
	public void method4() {
		System.out.println("Child-method4()");
	}

}
