package com.yedam.test;

public class Hello {
	// 엄밀히 말하면 이 메서드는 Hello 라는 클래스 안에 있는거지만 public 상태로 공개하는거임.
	// 외부의 전역 리턴타입 메서드이름(매개변수)
	public static void main(String[] args) {
		// void 라는것은 리턴하는 값이 없음을 표시하는것.
		// JAVA 실행할 때 핵심 메서드 => 메인메서드
		//System.out.println("Hello, World!"); // console.log랑 비슷한거, 쌍따옴표만 써야함.

		/*for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		while(true) {
			int first = (int)(Math.random()*6)+1;
			int second = (int)(Math.random()*6)+1;
			System.out.println("(눈1: "+first+ ","+"눈2: "+second+")");
			if(first+second !=5) {
				continue;
			}else {
				break;
			}
		}
		
	}
}
