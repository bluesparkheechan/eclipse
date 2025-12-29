package com.yedam.java.ch0605;

public class SingletonExample {
	public static void main(String[] args) {
		
		//외부에서는 private 처리가 돼있어 사용할 수 없다.
		//Singleton obj1 = new Singleton();
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("객체가 같음");
			
		}else {
			System.out.println("객체가 다름");
		}
	}
}
