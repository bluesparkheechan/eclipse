package com.yedam.java.ch0401;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String score = sc.nextLine();
		// IF문 : 조건이 참인 경우만 실행
		if(Integer.parseInt(score) >= 90) {
			System.out.print("점수가 90점 보다 큽니다.\n등급은 A입니다.\n");
		
		}
		// IF ELSE문 : 조건식이 참, 거짓 각각 확인하여 실행
		if(Integer.parseInt(score)>=60) {
			System.out.println("점수가 60점 이상입니다.");
			System.out.println("해당 과목은 통과되었습니다.");
			
		}else { //위에 선언된 모든 조건식을 만족하지 않는 경우 else블록 실행
			System.out.print("점수가 60점 미만입니다/n해당 과목은 재수강 대상입니다.");
		}
		
		// IF ELSE IF ELSE 다중 조건문
		if(Integer.parseInt(score)>=90) {
			System.out.println("과목 등급은 A입니다.");
		}else if(Integer.parseInt(score)>=80){
			System.out.println("과목 등급은 B입니다.");
		}else if(Integer.parseInt(score)>=70) {
			System.out.println("과목 등급은 C입니다.");
		}else if(Integer.parseInt(score)>=60) {
			System.out.println("과목 등급은 D입니다.");
		}else {
			System.out.println("과목 등급은 F입니다.");
		}
		

	}
}
