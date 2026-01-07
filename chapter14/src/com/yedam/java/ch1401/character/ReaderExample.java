package com.yedam.java.ch1401.character;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test3.txt");
		char[]buffer = new char[30];
		while(true) {
			int readCharNum = reader.read(buffer);
			if(readCharNum == -1) {break;
			}
			String str = new String(buffer);
			System.out.println(str);
			//for(int i = 0; i<buffer.length; i++) {
				//System.out.print(buffer[i]);
			//}
			reader.close();
		}
	}
}
