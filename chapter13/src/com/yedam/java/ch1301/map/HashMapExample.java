package com.yedam.java.ch1301.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map  = new HashMap<>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수 : "+map.size());
		
		//객체 찾기
		System.out.println("\t홍길동 : "+map.get("홍길동"));
		System.out.println();
		
		//전체순환
		//1) keySet 기반
		//Key만 Set 타입으로 만들어서 value 가져오기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next()	;
			Integer value = map.get(key);
			System.out.println("\t"+key+ " : "+ value);
		}
		for(String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + " : "+ value);
			
		}
		System.out.println();
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 엔트리 수 : "+map.size());
		
		//2) entrySet
		Set<Map.Entry<String, Integer>>entrySet = map.entrySet();
		for(Map.Entry<String, Integer>entry : entrySet) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("key : "+key+" || value : "+value);
		}
		
	}
}
