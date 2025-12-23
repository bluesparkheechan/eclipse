package com.yedam.java.ch0202;

public class CharExample {

	public static void main(String[] args) {
		// char : 유니코드
		int val = 65;
		char c1 = 65; //유니코드 65 => A
		
		char c2 = (char)(c1+1); // 캐릭터타입은 자동 타입 변환이 안되기 때문에 강제 타입변환을 (char)붙여서 해준거임.
		System.out.println(val);// 65
		System.out.println(c1); // A
		System.out.println(c2); // B

		int v2 = '각'; //char 타입의 리터럴은 홀따옴표 사용 => 기본적으로 char은 글자로 출력하지만, 내부적으로는 숫자로 처리되고 있다.
		//int v3 = 'AB' //char 타입은 글자 두 개를 입력할 수 없음. 글자 하나 하나만 처리가능함. => String을 사용
		char c3 = 'C';
		System.out.println(v2);
		System.out.println(c3);
		
		String str = "CA"; //이 str을 배열로 만드는게 2줄 아래
		System.out.println(str); 
		char[] cAry = str.toCharArray(); //str을 받아와서 두 글자를 하나하나로 쪼개서 배열로 넣는것
		System.out.println(cAry[0]+ "," + cAry[1]); // 0번째와 1번째 그리고 , 를 넣어줌 => C, A
	}

}
