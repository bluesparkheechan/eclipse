package com.yedam.java.ch1401.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteArrayExample {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:/temp/test2.db");
		
		byte[]array = {10,20,30,45,55,120,23,122,33,67,127};
		os.write(array);
		
		os.flush();
		os.close();
		
	}
}
