package com.yedam.java.ch0402;

import java.awt.Menu;
import java.util.Scanner;

public class Ch0402_03 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int result;
		while (run) {
			System.out.println("==================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("==================================");
			System.out.print("선택> ");
		
		String strmenu = scanner.nextLine();
		int menu = Integer.parseInt(strmenu);
		switch (menu) {
		case 1:
			System.out.print("입금액> ");
			result = Integer.parseInt(scanner.nextLine());
			System.out.println(result);
			balance += result;
			break;

		case 2:
			System.out.print("출금액> ");
			result = Integer.parseInt(scanner.nextLine());
			if (balance >= result) {
				balance = balance - result;
				System.out.println(result);
			} else {
				System.out.println("잔고가 부족합니다.");
			}break;
			
		case 3:
			System.out.printf("잔고> %d%n", balance);
			break;

		case 4: System.out.println("프로그램 종료");
				run = false;
				break;
			}}

	}
}