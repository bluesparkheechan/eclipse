package com.yedam.java.ch0204;

public class PrintExample {

	public static void main(String[] args) {
		// System.out.print()
		System.out.print("Hello");
		System.out.print(",");
		System.out.print(" World");
		// System.out.print() + \n => System.out.println()
		System.out.print("!\n"); // System.out.println(Hello, World);
		// System.out.printf()
		System.out.printf("%-6d", 1000);
		System.out.printf("이름: %s,  나이: %d,  월급: %010.3f", "홍길동", 32, 250.25);
		System.out.printf("이름: %s,  나이: %d,  월급: %012.11f", "홍길동", 32, 250.25);
		
	}

}
