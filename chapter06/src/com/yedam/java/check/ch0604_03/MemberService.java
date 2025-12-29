package com.yedam.java.check.ch0604_03;

public class MemberService {
	// 필드
	String id;
	String password;
	boolean result;
	// 생성자
	public MemberService(){
		
	}
	// 메서드
	boolean login(String id, String password) {
		this.result = false;
		if (id.equals("hong")) {
			if (password.equals("12345")) {
				this.result = true;
			} else {
				this.result = false;
			}
		} else {
			this.result = false;
		}
		return this.result;

	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
