package com.yedam.java.ch0202;

public class RealNumberExample {

	public static void main(String[] args) {
		// float : 소수점 이하 7자리
		// double : 소수점 이하 15자리 => default
		float f1 = 0.212312812312312F; //같은 범위라고 하더라도, F라고 코멘트 붙여줘야함 => 소숫점 자리 아래는 올림됨
		double d1 = 0.212312812312312;
		System.out.println(f1);
		System.out.println(d1);
		

	}

}
