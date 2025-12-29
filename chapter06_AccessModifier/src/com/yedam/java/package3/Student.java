package com.yedam.java.package3;

import java.util.Scanner;

public class Student {

	
	//필드
	//학생수
	private String name;
	private int engScore;
	private int korScore;
	private int mathScore;
	
	//생성자
	public Student() {
		
	}
	public Student(String name, int korScore, int engScore, int mathScore) {
		this.name=name;
		this.korScore=korScore;
		this.engScore=engScore;
		this.mathScore=mathScore;
	}
	//getter/setter
	public void setName(String name) {
		this.name=name;
	}
	public void setEngScore(int engScore) {
		this.engScore=engScore;
	}
	public void setKorScore(int korScore) {
		this.korScore=korScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore=mathScore;
	}
	
	public String getName() {
		return this.name;
	}
	public int getKorScore() {
		return this.korScore;
	}
	public int getEngScore() {
		return this.engScore;
	}
	public int getMathScore() {
		return this.mathScore;
	}
	//기능 메소드
	public void showInfo() {
		String info =this.name +" | "+this.korScore+" | "+this.engScore+" | "+this.mathScore;
		System.out.println(info);
	}
	
	
}
