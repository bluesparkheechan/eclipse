package com.yedam.java.ch0502;

public class ArrayTestExample {
	public static void main(String[] args) {
		// 문제 : 1, 4, 9, 2, 5 중 최대값, 최소값 구하기
		int[] ary = {1,4,9,2,5};
		int max = ary[0];
		int min = ary[0];
		for(int i=0; i<ary.length; i++) {
			if(ary[i]>max) {
				max = ary[i];
			}else {
				max = max;
			}
			
		}System.out.println(max);
		for(int i=0; i<ary.length; i++) {
			if(ary[i]<min) {
				min = ary[i];
			}else {
				min = min;
			}
		}System.out.println(min);
		for(int i=0; i<ary.length; i++) {
			int current = ary[i];
			if(current>max) {
				max = current;
				}
			if(current<min) {
				min = current;
			}
		}System.out.println("max: "+max+" min: "+min);
	}
}
