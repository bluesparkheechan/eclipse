package com.yedam.java.package3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) throws IOException {
		Student std = new Student();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int studentNum = 0;
		Student[] scoreList = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int enghigh = 0;
		int korhigh = 0;
		int mathhigh = 0;
		String engName = null;
		String korName = null;
		String mathName = null;

		while (run) {
			System.out.println("=========================================");
			System.out.println("1.학생수 |2.점수입력 |3.점수리스트 |4.분석 |5.종료");
			System.out.println("=========================================");
			System.out.print("선택> ");
			// 메뉴1) 학생 수 입력
			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				studentNum = Integer.parseInt(scanner.nextLine());
				scoreList = new Student[studentNum];
			}
			// 메뉴2) 이름, 점수 입력
			else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {

					System.out.print("이름> ");
					String name = scanner.nextLine();
					System.out.print("국어점수> ");
					int korScore = Integer.parseInt(scanner.nextLine());
					System.out.print("영어점수> ");
					int engScore = Integer.parseInt(scanner.nextLine());
					System.out.print("수학점수> ");
					int mathScore = Integer.parseInt(scanner.nextLine());

					Student student = new Student(name, korScore, engScore, mathScore); // 한 학생의 정보를 인스턴스화 시킨 상황
					scoreList[i] = student;

				}
			}
			// 메뉴3) 점수 호출
			else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					scoreList[i].showInfo();
					
				}
			} else if (selectNo == 4) {
				for (int i = 0; i < studentNum; i++) {
					if (scoreList[i].getEngScore() > enghigh) {
						enghigh = scoreList[i].getEngScore();
						engName = scoreList[i].getName();
					}
					if (scoreList[i].getKorScore() > korhigh) {
						korhigh = scoreList[i].getKorScore();
						korName = scoreList[i].getName();
					}
					if (scoreList[i].getMathScore() > mathhigh) {
						mathhigh = scoreList[i].getMathScore();
						mathName = scoreList[i].getName();
					}
				}System.out.println("국어점수 중 최고점을 받은 사람은 "+korName+"이며 점수는"+korhigh+"입니다.");
				System.out.println("영어점수 중 최고점을 받은 사람은 "+engName+"이며 점수는"+enghigh+"입니다.");
				System.out.println("수학점수 중 최고점을 받은 사람은 "+mathName+"이며 점수는"+mathhigh+"입니다.");
			}else if(selectNo==5) {
				System.out.println("프로그램 종료");
				break;
			}

		}
	}
}
