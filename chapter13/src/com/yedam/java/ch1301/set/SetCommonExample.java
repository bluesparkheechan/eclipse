package com.yedam.java.ch1301.set;

import java.util.HashSet;
import java.util.Set;

public class SetCommonExample {
	public static void main(String[] args) {
		Set <String> set = new HashSet<>();
		//객체추가
		set.add("홍길동");
		set.add("강호동");
		set.add("홍길동");
		
		//크기
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		// => set은 add로 추가하였다고해서 객체수가 늘어나지 않음. add는 세번 호출했지만 실제 사이즈는 2개.
		// => 중복되는 데이터는 그냥 덮어써짐.
	}
}
