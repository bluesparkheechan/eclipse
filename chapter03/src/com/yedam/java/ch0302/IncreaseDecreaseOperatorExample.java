package com.yedam.java.ch0302;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		// 단항) 증감 연산자(++/--)
		int x = 10;
		int y = 10;
		int z = 0;
		
		System.out.println("-----------------------");
		x++;
		++x;
		System.out.println("x=" + x); //12
		
		System.out.println("-----------------------");
		y--;
		--y;
		System.out.println("y="+y); // 8
		
		System.out.println("-----------------------");
		z = x++;
		System.out.println("z="+z); //12
		System.out.println("x="+x); //13
		
		System.out.println("-----------------------");
		z = ++x + y++;
		//1) ++x
		//2) z = x + y
		//3) y++
		System.out.println("z="+z); //22
		System.out.println("x="+x); //14
		System.out.println("y="+y); //9
	}
}
