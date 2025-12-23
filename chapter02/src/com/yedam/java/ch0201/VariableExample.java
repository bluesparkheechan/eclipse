package com.yedam.java.ch0201;

public class VariableExample {

	public static void main(String[] args) {
		/*
		 * 변수 선언 및 사용
		 */
		int hour=8;
		int minute = 5;
		System.out.println(hour + "시간"+minute+"분"); //8시간 5분
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 "+ totalMinute + "분"); // 총 485분
		/*
		 * 변수 사용범위 <=> 스코프(scope) : 자바의 변수 스코프는 블록단위(중괄호를 기준으로 한 블록)
		 */
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1-10;
		}
		// int v3 = v1+ v2 +5; //v2는 if 블록 내부에서 선언 되었기 때문에 사용이 안됨.
	}

}
