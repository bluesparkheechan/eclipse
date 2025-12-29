package com.yedam.java.ch0502;

public class MultiArrayExample {
	public static void main(String[] args) { 
		//다차원 배열 == 참조타입배열
		String[] strAray = {"신용권", "감자바"}; 
		
		for(String text : strAray) {
			System.out.println(text);
		}		//객체가 세개 만들어진거다 1)신용권, 2)감자바, 3)신용권 감자바 두개 들고 있는 부모 배열
	
		//2차원 배열
		int[][]intAry = null;
		intAry = new int[][] {{1,2}, {3,4,5}, {6}};
		for(int i=0; i<intAry.length; i++) {
			int[] currentAry = intAry[i];
			for(int j=0; j<currentAry.length; j++) {
				int curVal = currentAry[j];
				System.out.printf("[%d][%d] : %d\n", i, j, curVal);
			}
		}
		// 결국 배열 속의 배열이 2차원 배열이다. 그 2차원 배열을 임의로 i라고 칭해서 첫 번째, 두 번째 값들을 불러올 뿐이다.
		// 불러온 값들은 객체이므로 그 안의 첫 번째, 두 번째, 세 번째 값들을 j라는 값으로 불러오는것이다. 
		intAry = new int[2][];
		intAry[0] = new int[] {1,2};
		intAry[1] = new int[] {3,4,5};
		
	}
}
