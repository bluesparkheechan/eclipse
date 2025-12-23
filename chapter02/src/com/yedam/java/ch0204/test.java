package com.yedam.java.ch0204;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String name = scanner.nextLine();
	
	String jumin = scanner.nextLine();
	
	String phone = scanner.nextLine();
	
	System.out.printf("1.이름: %1$s%n2.주민번호 앞 6자리: %2$s%n3.전화번호: %3$s", name, jumin, phone);
		
	}

}
