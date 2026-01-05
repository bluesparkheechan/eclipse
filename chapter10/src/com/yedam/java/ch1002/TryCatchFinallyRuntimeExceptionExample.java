package com.yedam.java.ch1002;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			return; //여기서 스탑 시켰는데
		}finally { //무조건 실행하도록 보장이 돼있기 때문에 return을 만났더라도 실행이됨.
			System.out.println("다시 실행하세요");
		}
	}
}
