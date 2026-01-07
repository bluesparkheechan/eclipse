package com.yedam.java.ch1101.string;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		//기본 문자셋(UTF-8)으로 인코딩과 디코딩
		byte[]bytes1 = str.getBytes();
		System.out.println("bytes1.length: "+bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: "+str1);
		
		try {
			//EUC-KR : 한글 2Byte로 표현
			byte[]bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: "+bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes1->String: "+str2);
			String str3 = new String(bytes2, "UTF-8");
			System.out.println("bytes1->String: "+str3);
			//UTF-8 : 한글 3Byte로 표현 => 표준
		
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
	}
}
