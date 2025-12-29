package com.yedam.java.ch0502;

public class ArrayCommonExample {
	public static void main(String[] args) {
		//배열 선언 및 생성
		int[] intAry = null;
		// 배열 선언 후 생성
		intAry = new int[] {1, 3, 4}; // 값을 가지고 있는 배열
		System.out.println("길이: " + intAry.length); //length는 readonly임 변결할 수 없음.
		for(int i=0; i<intAry.length; i++) {
			System.out.println(i+") "+intAry[i]);
		}
		intAry = new int[5];  // 크기만 지정된 배열
		for(int i=0; i<intAry.length; i++) {
			System.out.println(i+") "+intAry[i]);
		}
		for(int i=0; i<intAry.length; i++) {
			intAry[i] = i*10;
		}
		for(int i=0; i<intAry.length; i++) {
			System.out.println(i+ ") "+ intAry[1]);
		}
	}
}
