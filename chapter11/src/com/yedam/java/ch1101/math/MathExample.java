package com.yedam.java.ch1101.math;

public class MathExample {
	public static void main(String[] args) {
		//ceil
		double v1 = Math.ceil(5.003);
		double v2 = Math.ceil(-5.003);
		System.out.println("v1 : "+ v1);
		System.out.println("v2 : "+ v2);
		//floor
		double v3 = Math.floor(5.003);
		double v4 = Math.floor(-5.003);
		System.out.println("v3 : "+ v3);
		System.out.println("v4 : "+ v4);
		//rint >> 중간값일때(.5일때 >> 짝수정수로 반올림함 => 4.5면 가까운 짝수인 4로 5.5이면 가까운 짝수인 6으로 반올림한다.)
		double v5 = Math.rint(5.0302102); // 5.0
		double v6 = Math.rint(4.5); // 4.0
		double v7 = Math.rint(5.5); // 6.0
		System.out.println("v5 : "+ v5);
		System.out.println("v6 : "+ v6);
		System.out.println("v7 : "+ v7);
		//round
		long v8 = Math.round(5.0000000000001); //5
		long v9 = Math.round(5.1234819200282); //5
		double v10 = Math.round(5.696079939101); //6
		System.out.println("v8 : "+ v8);
		System.out.println("v9 : "+ v9);
		System.out.println("v10 : "+ v10);
	}
}
