package com.yedam.java.ch0501;

public class ReferenceCommonExample {
	public static void main(String[] args) {// 1번 메서드 string
		String meg = "Hello World"; //1) 이걸 Heap 영역으로 객체로 만듬.
		boolean result = firstMethod(); //2)(클래스 안의)메서드를 실행
		
		System.out.println(meg);
		System.out.println("result: "+ result);
		
	}
	
	public static boolean firstMethod() {//2번 메서드 boolean
		char v1 = 'A'; //3)2byte짜리 변수 스택쌓음
		
		if(v1 == 'A') { //4)v1 스택위에 v2(4byte 값100)와 v3(8byte 값 3.14) 스택 쌓음  
			int v2 = 100;
			double v3 = 3.14;
		} //5) 블럭이 종료가 되면서 스택 사라짐
		boolean v4 = true;
		return v4; // 리턴으로 메인 메서드에 쌓으면서 다른 스택 소멸
	}
}
