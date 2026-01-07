package com.yedam.java.ch1101.string;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[]bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		//String 생성자를 통해 사람이 인식할 수 있는 문자로 변환
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6,4);
		System.out.println(str2);
		
		char str3 = 65;
		System.out.println(str3);
	}
}
