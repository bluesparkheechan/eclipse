package com.yedam.java.ch1401.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:/Temp/test1.db"); //기존 파일이 있다면 덮어써버림.
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
	}
}
