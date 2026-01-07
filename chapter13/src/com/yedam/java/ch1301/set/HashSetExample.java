package com.yedam.java.ch1301.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String>set = new HashSet<>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATS");
		
		//크기
		int size = set.size();
		System.out.println("총 객체수 : "+ size);
		
		//반복자
		Iterator <String> iterator = set.iterator(); //Iterator의 타입파라미터는 콜렉션의 타입파라미터워 같아야만한다.
		while(iterator.hasNext()) {
			String skill = iterator.next();
			System.out.println(skill);
		}
		//객체 제거
		set.remove("JDBC");
		set.remove("iBATS"); // remove를 하더라도 객체 자체가 없어지는게 아니라 set 콜렉션 안에서 제거되는것.
		System.out.println();
		
		//향상된 for문
		for(String str : set) {
			System.out.println("\t"+str);
		}
	}
	
}
