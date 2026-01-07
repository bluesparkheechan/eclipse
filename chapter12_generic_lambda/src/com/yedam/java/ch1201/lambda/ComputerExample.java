package com.yedam.java.ch1201.lambda;

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = (x,y)->{
			int result = x+y;
			return result;
		};
		
		com = (x,y)->{return x+y;};
		//실행하는 코드가 한줄이고 return 구문일경우
		// 중괄호와 함께 return도 생략해야함.(생략이 필수)
		com = (x,y)-> x+y;
		
		
	}
}
