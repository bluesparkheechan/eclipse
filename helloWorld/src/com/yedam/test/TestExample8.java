package com.yedam.test;

import java.util.Scanner;

public class TestExample8 {
	public static void main(String[] args) {
		//8번문제
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int deposit=0;
		int withdraw=0;
		while(run) {
			System.out.println("===============================");
			System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.종료");
			System.out.println("===============================");
			System.out.print("선택 : ");
			int select = scanner.nextInt();
			if(select == 1) {
				System.out.print("예금액 : ");
				deposit = scanner.nextInt();
			}else if(select ==2) {
				System.out.print("출금액 : ");
				withdraw = scanner.nextInt();
				if(withdraw>deposit) {
					System.out.println("잔액이 부족합니다!");
					System.out.println("출금 가능액 : "+ deposit + "원");
				}else {
					deposit -= withdraw;
					
				}
			}else if(select ==3) {
				System.out.println("현재 잔액 : "+ deposit+"원");
			}else if(select ==4) {
				System.out.println("이용해 주셔서 감사합니다.");
				run = false;
			}
		}scanner.close();
		
	}
}
