package com.yedam.java.ch0302;

import java.util.Scanner;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String score = scanner.nextLine();
		char grade = Integer.parseInt(score)>90 ? 'A':(Integer.parseInt(score)>80 ? 'B':'C');
		System.out.println(grade);
	}
}
