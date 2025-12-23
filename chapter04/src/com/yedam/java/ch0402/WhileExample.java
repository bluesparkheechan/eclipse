package com.yedam.java.ch0402;

public class WhileExample {
	public static void main(String[] args) {
		// While 1) 회수 제한 없이 조건에 따라 반복 2) 무한반복
		// 정수 1~10까지 출력
		int i =1;
		while(i<=10) {
			i++;
			System.out.print(i);
		}
		int j = 1;
		while(true) {
			if(j>10)break;
			System.out.println(j);
			j++;
		}
		
	}
}
