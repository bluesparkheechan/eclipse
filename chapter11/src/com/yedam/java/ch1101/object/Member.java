package com.yedam.java.ch1101.object;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Member) {
			Member member = (Member) obj;

			if (member.id.equals(this.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		
		return this.id.hashCode();
	}

	@Override
	public String toString() {
		//직렬화(Serialize, 객체를 문장으로 변환) 메서드
		return "Member - id : " + this.id;
	}
	

}
