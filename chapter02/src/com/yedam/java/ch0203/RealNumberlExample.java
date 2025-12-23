package com.yedam.java.ch0203;

public class RealNumberlExample {

	public static void main(String[] args) {
		//실수 연산
		//1) 동일한 타입일 경우 해당 타입으로 연산
		float a = 0.12f;
		float b = 0.1f;
		float c = a+b;
		//2) double 타입이 포함된 경우 모두 double로 변환
		float v1 = 0.12f;
		double v2 = 0.1f;
		// float v3 = v1+v2; => 컴파일에러. 하나라도 double이 포함돼 있으면 double로 자동변환.
		//방법1. float v3 = (float)(v1+v2);
		//방법 2. double v3 = v1+v2;
		
		
	}

}
