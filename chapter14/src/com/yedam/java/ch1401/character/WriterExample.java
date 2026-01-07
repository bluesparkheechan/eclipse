package com.yedam.java.ch1401.character;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test3.txt");
		String message = "Hello, world!!\n 오늘은 수요일!";
		writer.write(message);
		
		writer.flush();
		writer.close();
	}
}
