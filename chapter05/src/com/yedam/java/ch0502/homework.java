package com.yedam.java.ch0502;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int highScore = 0;
		double avg = 0.0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("===================================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
			System.out.println("====================================================");
			System.out.print("선택>");

			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
			}
			else if (selectNo == 2) {
				scores = new int[studentNum];
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}
			else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			}
			else if (selectNo == 4) {
				avg =0;
				highScore = scores[0];
				int sum = 0;
				for (int i = 0; i < studentNum; i++) {
					sum = sum + scores[i];
					avg = (double) sum / studentNum;
					if (highScore < scores[i]) {
						highScore = scores[i];
					}

				}
				System.out.println("최고 점수: " + highScore);
				System.out.println("평균 점수: " + avg);
			}
			else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				run = false;
				scanner.close();
			}
			else {
				System.out.println("1~5까지만 입력해주세요");
			}
		}
	}

}
