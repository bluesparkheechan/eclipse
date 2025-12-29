package com.yedam.java.ch0603;
//라이브러리 class Car 생성: 내부에 main method 없음. 객체를 정의하는 목적으로 만들어짐.
public class Car {
	//필드 : 객체의 정보(속성) (변수를 선언하는것과 비슷함)(필드는 고유 정보 뿐만 아니라, 상태값을 가질 수 있다.)
	String company;
	//모델
	String model;
	//색상
	String color;
	//최대속도
	int maxSpeed;
	//현재속도 상태값(고유정보x)
	int currentSpeed;
	
	//생성자 : 리턴타입이 없고, 고유이름 대신 클래스명을 사용.
	//인스턴스 생성 시 초기값 설정이 목적
	public Car(String model, String color){
		this("현대자동차", model, color);
		//this.company = "현대자동차";
		//this.model = model; //매개변수와 필드변수의 이름이 같을 때 이런경우 로컬변수의 순위가 우선이다.
		//this.color = color;
		
	}
	public Car(String company, String model, String color){

		this.company = company;
		this.model = model; //매개변수와 필드변수의 이름이 같을 때 이런경우 로컬변수의 순위가 우선이다.
		this.color = color;
		
	}
	public Car(String company, String model, String color, int maxSpeed) {
		this(company, model, color);
		this.maxSpeed = maxSpeed;
		//this.company = company;
		//this.model = model;
		//this.color = color;
		//this.maxSpeed=maxSpeed;
	}
	// => 생성자 오버로딩 : 매개변수의 데이터타입 구성이 다르게 하여 
	//					다양한 형태의 인스턴스를 만들 수 있는 여러 생성자를 지원
	// 기본 생성자는 클래스 내부에 생성자가 하나도 없을 경우에만 자동추가한다.
	// 필요하다면 기본생성자는 수동으로 추가해야한다.
	public Car() {
		
	};
}
