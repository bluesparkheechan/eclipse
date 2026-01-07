package com.yedam.java.ch1102;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		// 현재 날짜와 시간을 저장
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 hh시 mm분 ss초");
		
		String newDate = sdf.format(now);
		System.out.println(newDate);
		//문자열 -> 날짜로 변환
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd"); //날짜 형식을 지정하고
		String DateStr = "20251231"; //해당 문자열을 가지고
		try {
			Date date= format.parse(DateStr); // 데이트 형식으로 만들 수도 있다.
			System.out.println(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
	}
}
