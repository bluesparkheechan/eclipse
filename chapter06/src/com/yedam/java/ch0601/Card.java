package com.yedam.java.ch0601;

//라이브러리 클래스
public class Card {
//필드
	// 카드 종류 : 마스터, 비자, 국내용
	String type;
	// 카드사 : 신한, 국민, 삼성, 현대, 하나, 롯데 ...
	String company;
	// 카드번호
	String cardNo;
	// 유효기간 : 년/월
	String expire;
	// CVC
	int cvc;
	// 사용자 영문명
	String userName;
	// 결제 대금
	int amount = 0;
	// 교통카드 대금
	int transportAmount = 0;
	Card(String cardNo, String expire, int cvc, String userName){
		this.type= type;
		this.company= company;
		this.cardNo = cardNo;
		this.expire = expire;
		this.cvc = cvc;
		this.userName=userName;
	}

	// 결제
	void payment(int price) {
		amount += price;
	}

	// 지급
	void bill() {
		this.amount = 0;
	}

	// 교통카드
	void transport(String type) {
		if(type.equals("버스")) {
			this.transportAmount+=1500;
		}else {
			this.transportAmount += 2000;
		}

}}
