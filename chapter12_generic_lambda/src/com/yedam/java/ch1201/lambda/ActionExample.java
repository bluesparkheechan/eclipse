package com.yedam.java.ch1201.lambda;

public class ActionExample {
	public static void main(String[] args) {
		//매개변수가 하나일 경우 소괄호 생략가능
		Action speaker = message -> {
			String presentation = message + "를 발표합니다.	";
			System.out.println(presentation);
		};
		speaker.speak("안녕하세요");
		
		//실행하는 코드가 한줄일 경우 중괄호 생략 가능
		speaker = message -> System.out.println(message+"를 발표합니다.");
		speaker.speak("안녕하세요");
	}
}
