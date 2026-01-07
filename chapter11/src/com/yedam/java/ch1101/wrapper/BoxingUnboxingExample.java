package com.yedam.java.ch1101.wrapper;

public class BoxingUnboxingExample {
	public static void main(String[] args) {
		//박싱
		Integer obj1 = new Integer(100); // <<<<< 생성자 사용하는 방식 없어졌음
		//자동 박싱 -> Wrapper 클래스
 		Integer obj2 = 200;
		Integer obj3 = 200;
		System.out.println(obj2 *2+100+obj3);
		if(obj2== obj3) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}//단 byte범위 -128~127 사이의 값이 주어지면 자동으로 언박싱해서 비교해서 같은 객체라고 나옴.
		if(obj2.equals( obj3)) {
			System.out.println("같은 값 입니다.");
		}else {
			System.out.println("다른 값 입니다.");
		}
		//언박싱 : Wrapper클래스 => 기본타입
		int value1 = obj1.intValue();
		//자동 언박싱
		int value2 = obj2;
		int value3 = obj3;
		int result = obj2 *2+100+obj3;
		System.out.println(result);
		
	}
}
