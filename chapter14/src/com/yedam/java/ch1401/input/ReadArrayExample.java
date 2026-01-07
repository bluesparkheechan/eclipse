package com.yedam.java.ch1401.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadArrayExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test2.db");
		
		byte[] buffer;
		while(true) {
			buffer = new byte[4];
			int readByteNum = is.read(buffer);
			if(readByteNum ==-1)break;
			for(int i=0; i<buffer.length; i++) {
			System.out.printf("%d : ", buffer[i]);
			}
			System.out.println();
		}
		is.close();
	}
}
