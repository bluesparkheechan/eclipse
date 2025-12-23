package com.yedam.java.ch0302;

public class AssignmentoperatorExample {
	public static void main(String[] args) {
		//복합 대입 연산자 중 산술 연산자와 결합한 형태
		//+=, -=, *=, /=, %=  
		// 1) 산술 연산자 => 2) 대입연산자 순서로 실행
		
		int result = 10;
		result += 10;
		//1) result + 10  2) result = 1)의 결과값
		//=> result = result +10;
		System.out.println("result ="+ result); //20
		
		result -= 5;
		System.out.println("result ="+result);//15
		
		result *=3;
		System.out.println("result ="+result);//45
		
		result /=5;
		System.out.println("result ="+result);//9
		
		result %=3;
		System.out.println("result="+result);//0
	}
}
