package com.yedam.java.ch0203;

public class ByteOperationExample {

	public static void main(String[] args) {
		// 정수 연산
		
		// 1) int 보다 하위 타입을 기준으로 연산 할 경우 int로 자동변환
		byte x = 30;
		byte y = 50;
		// byte z = x+y; 값의 범위와 상관없이 정수의 연산은 기본 int로 변환 돼야한다.
		// 방법 1 byte z = (byte)(x+y);
		// 방법 2 int z = x+y;
		// 2) long이 하나라도 포함될 경우 모두 long으로 자동변환
		int a = 1000;
		long b = 15000L;
		// int c = a+b; 연산되는 값 중 하나라도 long 타입이 섞이면 값의 실제 범위와 상관없이 long으로 자동 변환. 
		// 방법 1. int c = (int)(a+b);
		// 방법 2. long c = a+b;
		
		

	}

}
