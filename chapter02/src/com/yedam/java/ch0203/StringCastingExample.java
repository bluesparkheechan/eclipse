package com.yedam.java.ch0203;

public class StringCastingExample {

	public static void main(String[] args) {
		
		// 강제 타입변환 : 각 타입별 메서드 사용
		int val1 = Integer.parseInt("1234");
		double val2 = Double.parseDouble("2.25");
		double result = val1 + val2; //1234.0 + 2.25 = 1236.25
		System.out.println(result);

	}

}
