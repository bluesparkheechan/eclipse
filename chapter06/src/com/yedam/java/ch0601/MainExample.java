package com.yedam.java.ch0601;

public class MainExample {
	//실행 클래스: main 메소드만 포함
	public static void main(String[] args) {
		Card hong = new Card("12345678", "30/12", 598, "Hong");
		Card kang = new Card("98765432", "30/12", 753, "Kang");
		//hong
		hong.transport("버스");
		hong.payment(15000);
		hong.payment(4500);
		System.out.println("hong>");
		System.out.println("결제대금: "+hong.amount);
		System.out.println("\t카드번호: "+hong.cardNo);
		//kang
		kang.transport("지하철");
		kang.payment(32000);
		System.out.println("kang>");
		System.out.println("결제대금: "+kang.amount);
		System.out.println("\t카드번호: "+kang.cardNo);
	}
}
