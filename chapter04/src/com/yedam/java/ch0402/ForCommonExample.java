package com.yedam.java.ch0402;

public class ForCommonExample {

	public static void main(String[] args) {
		// for문 사용 1) 반복횟수 2) 무한루프에 빠질 위험이 적음.
		// 정수 1~10까지 출력
		int i = 0;
		for(i = 10; i>0; i--) { // 1. i의 초기값 2. 반복조건 3. 증감식 순으로 
			System.out.println(i);
		}
		for(int j=10; j>0; j--) {
			System.out.println(j);
		}
		
		
		//실수 0.1~1.0까지 출력
		double t = 0.1;
		for(float k = 0.1f; k <=1.0f; k+=t){
			System.out.println(k);}
		
	}

}
