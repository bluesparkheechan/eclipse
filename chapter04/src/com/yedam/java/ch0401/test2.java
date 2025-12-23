package com.yedam.java.ch0401;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디: ");
		String name = scanner.nextLine();
		
		System.out.println("패스워드: ");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password==1234) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패 : 비밀번호 오류");
			}
		}else {
			System.out.println("로그인 실패 : 아이디 오류");
		}
	}
}
