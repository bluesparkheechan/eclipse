package com.yedam.java.ch0402;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("=========================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("=========================");
			System.out.print("선택> ");

			String strScan = scanner.nextLine();
			String strScan1 = scanner.nextLine();
			int scan = Integer.parseInt(strScan);
			int scan1 = Integer.parseInt(strScan);
			if (scan == 1) {
				System.out.printf("선택> %d%n", scan);
				System.out.printf("예금액> %d%n", scan1);
			} else if (scan == 2) {
				System.out.printf("선택> %d%n", scan);
				System.out.printf("출금액> %d%n", scan1);
			} else if (scan == 3) {
				System.out.printf("선택> %d%n", scan);
				System.out.printf("잔고> %d%n", scan1);

			} else {System.out.printf("선택> %d%n", scan);
			} 
		}

	}
}
