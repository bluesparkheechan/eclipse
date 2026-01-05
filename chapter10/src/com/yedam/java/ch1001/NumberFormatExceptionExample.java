package com.yedam.java.ch1001;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data = "1000";
		String data1 = "a100";
		
		int value1 = Integer.parseInt(data);
		int value2 = Integer.parseInt(data1);
		
		int result = value1 + value2;
		System.out.printf("%d + %d = %d", data, data1, result);
	}
}
