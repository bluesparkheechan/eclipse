package com.yedam.java.ch1101.object;

import java.util.HashMap;
import java.util.Map;

public class KeyExample {
	public static void main(String[] args) {
		//<key,value>
		Map<Member, String> map = new HashMap<Member,String>();
		//값을 저장
		map.put(new Member("A"), "홍길동"); // A라는 값을 id로 가진 Member클래스, 홍길동 객체 생성 후 Map에 값을 넣음
		//값을 읽을때
		String name = map.get(new Member("A"));
		System.out.println(name);
		
		System.out.println(new Member("야스"));
	}
}
