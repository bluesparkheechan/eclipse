package com.yedam.java.ch0202;

public class IntegerExample {

	public static void main(String[] args) {
		//byte = 1byte 정수들 중 byte 타입인것
		byte v1 = -128;
		byte v2 = -30;
		byte v3 = 0;
		byte v4 = 30;
		// byte v5 = 128; =>byte 범위:-128~127 => 128은 type byte out of range
		
		//int = 4byte => default
		int var1 = 100000000;
		//int var2 = 10000000000; => 10억부터 안된다.
		
		//long = 8byte
		long var2 = 10000000000L; // L을 안붙이면 선언 데이터 타입은 long으로 했더라도, 리터럴 자체는 int로 인식하기 때문에 L을 붙여줘서 Long으로 인식시킴.
	}

}
