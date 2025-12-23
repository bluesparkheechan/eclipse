package com.yedam.java.ch0401;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int score = 67;
		int score1 = (score/10)*10;

		
		switch(score1) {
		case 100 : 
		case 90 : System.out.println("A등급");
		break;
		case 80 : System.out.println("B등급");
		break;
		case 70 : System.out.println("C등급");
		break;
		case 60 : System.out.println("D등급");
		break;
		default : System.out.println("F등급");
		break;
		}
		
		Scanner scanner = new Scanner(System.in);
		String first = scanner.nextLine();
		String second = scanner.nextLine();
		double result = Double.parseDouble(first)+Double.parseDouble(second);
		if(Double.parseDouble(second) == 0) {
			System.out.println("결과: 무한대");
		}else if(Double.parseDouble(second) == 0.0){
			{System.out.println("결과: 무한대");
		}
			System.out.printf("결과: %4.1f", result);
		}
	}
}
