package com.yedam.test;

import java.util.Scanner;

public class TestExample7 {
	public static void main(String[] args) {
		//7번문제
		Scanner scanner = new Scanner(System.in);
		int randomNumber = (int) (Math.random() * 50) + 1;
		boolean run = true;
		while (run) {
			
			System.out.print("숫자 입력 : ");
			int num = scanner.nextInt();
			if(randomNumber > num) {
				System.out.println("up하세요!!");
				
			}else if(randomNumber < num) {
				System.out.println("down하세요!!");
			}else {
				System.out.println("축하합니다!!");
				break;
			}
		}scanner.close();
		
		
	}
}
