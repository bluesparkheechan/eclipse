package com.yedam.java.ch0602;
//라이브러리 class Car 생성: 내부에 main method 없음. 객체를 정의하는 목적으로 만들어짐.
public class Car {
	//필드 : 객체의 정보(속성) (변수를 선언하는것과 비슷함)(필드는 고유 정보 뿐만 아니라, 상태값을 가질 수 있다.)
	String company = "현대자동차";
	//모델
	String model = "그랜저";
	//색상
	String color = "검정";
	//최대속도
	int maxSpeed = 250;
	//현재속도 상태값(고유정보x)
	int currentSpeed;
}
