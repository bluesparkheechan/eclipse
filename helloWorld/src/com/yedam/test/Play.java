package com.yedam.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Play {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int random = (int) (Math.random() * 50) + 1;
		while(true) {
			System.out.println("숫자 입력 : ");
			int number = Integer.parseInt(br.readLine());
			if(number<random) {
				System.out.println("up하거라");
				
			}else if(number>random) {
				System.out.println("down하거라");
			}else {
				System.out.println("축하하노라");
				break;
			}
		}
	}
}
