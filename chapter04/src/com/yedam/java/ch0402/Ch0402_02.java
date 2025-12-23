package com.yedam.java.ch0402;

public class Ch0402_02 {
	public static void main(String[] args) {
		int sum = 0; //이놈을 여기다 놔야하는 이유 : for문 안에 넣으면 sum = 0으로 계속 값이 초기화 되기때문에 누적 합계를 구할 수가 없다.
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {// 3의 배수일 경우
				sum = sum + i;
			}
		}
		System.out.println(sum); // 반복문이 종료가 된 후에 print해야 총 합을 구할 수 있다.
	}
}
