package com.yedam.java.ch0204;

import java.util.Scanner;

public class ScanProgramExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData = null;
		
		while(true) { //while(true)로 무한루프 만들어줌
			inputData = scanner.nextLine();
			System.out.printf("입력된 문자열: %s \n", inputData);
			if(inputData.equals("q")) { // equals: 문자용 메서드
			// 사용자가 입력한 값이 소문자 q일 경우 break(프로그램 종료)
				break;
			}
		}
		scanner.close();
		
		}

}
