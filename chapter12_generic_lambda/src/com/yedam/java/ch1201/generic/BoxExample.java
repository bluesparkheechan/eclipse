package com.yedam.java.ch1201.generic;

import java.util.Date;


public class BoxExample {

	public static void main(String[] args) {
		//제네릭은 인스턴스 생성시 반드시 결정
		Box<Date> dateBox = new Box<Date>();
		dateBox.setContent(new Date());
		Date today = dateBox.getContent();
		System.out.println(today);
		
		Box<String>strBox = new Box<String>();
		strBox.setContent("홍길동");
		String name = strBox.getContent();
		System.out.println(name);
		
		Box<Integer>intBox = new Box<Integer>();
		intBox.setContent(12345);
		Integer value = intBox.getContent();
		
		
	}
}
