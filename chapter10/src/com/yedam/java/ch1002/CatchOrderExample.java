package com.yedam.java.ch1002;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.printf("%d + %d = %d\n", value1, value2, result);
		}catch(NumberFormatException e){
			System.out.println("숫자가 아닙니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(ClassNotFoundException e) {
			
		}
		finally {
			System.out.println("다시 실행하세요");
			
		}
		
	}
}
