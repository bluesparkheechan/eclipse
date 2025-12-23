package com.yedam.java.ch0203;

public class StringPromotionExample {
	public static void main(String[] args) {
	// + 연산
		String str1 = String.valueOf(1+2+3); //"6" String.valueOf() > 문자열로 바꿔줄 때 쓰는 메서드
		String str2 = 1 + 2+ 3 + " "; //"6" 편법.. 위의 것과 결과가 같음
		String str3 = 1+2+"3"; // "33"
		String str4 = 1+"2"+3; // "123"
		String str5 = "1"+2+3; // "123"
		String str6 = ""+1+2+3; // "123"
		String str7 = "1"+(2+3); // "15"
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		
		

	}
}
