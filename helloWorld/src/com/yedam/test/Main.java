package com.yedam.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String []word = new String[T];
		for (int i =0; i < T; i++) {
			word[i] = br.readLine();
		}
		for(int i=0; i<T; i++) {
			System.out.println(word[i].substring(0,1));
			
		}
	}
}
