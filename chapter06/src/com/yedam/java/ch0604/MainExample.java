package com.yedam.java.ch0604;

public class MainExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();//기본 생성자 사용 < 자바가 지알아서 만든거임
		calculator.powerOn(); // .(dot)객체 접근 연산자.
				
		// 더하기
		int [] num = {5,6};
		int result = calculator.plus(num); //리턴 타입이 있는 메서드는 리턴되는 값을 담을 그릇이 필요하다. = 변수선언 !!
		System.out.println("result1 = "+result);
		// 나누기
		byte x = 10;
		byte y = 4;
		double result2 = calculator.divide(x, y);
		System.out.println("result2 = "+result2);
		
		//여러 값 더하기
		int[] datas = {1,2,3,4,5};
		int result3 = calculator.plus(datas);
		int result4 = calculator.minus(datas);
		System.out.println("result3 = "+result3);
		System.out.println("result4 = "+result4);
		result4 = calculator.minus(1,4,2,6,7);
		System.out.println("result4 = "+result4);
		calculator.powerOff();
	}
}
