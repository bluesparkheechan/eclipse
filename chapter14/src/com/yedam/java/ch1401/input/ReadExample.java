package com.yedam.java.ch1401.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream us = new FileInputStream("C:/Temp/test1.db");
		
		while(true) {
			int data = us.read();
			if(data==-1)break; //파일의 끝에 도달함
			System.out.println(data);
		}
		us.close();
	}
}
