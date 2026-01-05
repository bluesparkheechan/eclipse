package com.yedam.java.ch1002;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		// 특정 클래스 자체에 대한 정보를 가지는 Class라는 클래스가 있음.
		try {
			
			Class clazz = Class.forName("java.lang.String2");
			clazz.getMethods(); //특정 클래스의 메소드 목록을 끌어옴
		} catch (ClassNotFoundException e) {
			
			//e.printStackTrace();
			System.out.println("해당 클래스가 존재하지 않습니다");
		}
		
	}
}
