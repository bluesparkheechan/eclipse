package com.yedam.java.ch0502;

public class ArrayCopyExample {
	public static void main(String[] args) {
		//배열 복사
		int[]first = {1,2,3};
		//1)얕은 복사 (공유 하는것에 가까움)
		int[]second = first;
		second[1]=10;
		System.out.println("first[1]: "+ first[1]);
		
		//2)깊은 복사 (사본을 만드는 것에 가까움)
		int[]third = new int[3];
		for(int i=0; i<first.length; i++) {
			third[i] = first[i];
		}
		third[1]=1234;
		System.out.println(third[1]);
		
		int[]copyAry = new int[10];
		System.arraycopy(second, 0, copyAry, 5, 3);
		
		// 향상된 for문
		for(int val: copyAry) { //향상된 for문은 : 뒤에 있는 배열에 있는 값들을 :앞에 있는 변수에 담는것이다.
			System.out.println(val);
		}
	}
}
