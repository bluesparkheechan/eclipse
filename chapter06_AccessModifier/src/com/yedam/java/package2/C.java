package com.yedam.java.package2;

import com.yedam.java.package1.A;
import com.yedam.java.package1.B;

public class C {
//	A a; //default 접근제한자는 같은 패키지 내에서만 사용할 수 있기 때문에 다른 패키지에선 없는 존재임. 컴파일 에러
	B b; // public 접근제한자는 다른 패키지에서도 사용할 수 있기 때문에 자유롭게 import 해서 사용 가능함.

	//A a1 = new A(true); ->public이더라도 class가 public이어야만 사용가능.
	//A a2 = new A(1); -> default로 다른 패키지에선 이용 불가
	//A a3 = new A("문자열");->private로 클래스 내에서만 사용가능
	//생성자가 public이더라도 class가 default라면public멤버로 사용할 수 없다.
	
	public C() {
		A a = new A();
		a.field1 = 1; // public
		//a.field2 = 1; // default
		//a.field3 = 1; // private
		
		a.method1(); // public
		//a.method2(); // default
		//a.method3(); // private
	}

}
