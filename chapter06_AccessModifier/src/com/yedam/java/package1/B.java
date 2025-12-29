package com.yedam.java.package1;

public class B {
	A a; // A는 Default 이므로 같은 패키지 내에서는 class A에 대하여 접근이 가능하다.

	A a1 = new A(true);
	A a2 = new A(1);
	//A a3 = new A("문자열"); // 프라이빗은 클래스 내부에서만 사용가능 하기 때문에 컴파일 에러
	

}
