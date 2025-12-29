package com.yedam.java.ch0501;

public class StringExample {
	public static void main(String[] args) {
		String str1 = "신용권"; // Heap 영역에 신용권이라는 객체(1번힙) 생성 >> stack영역에 str1 생성  
		String str2 = "신용권"; // Heap 영역에 생성x 신용권이라는 값이 이미 있기 때문에 1번힙 참조하고 stack영역에 str2 생성
		
		str2 = "이것이 자바다"; // 이것이 자바다 라는 객체 생성후 stack영역에서 갈아치워버림
		System.out.println("str1: " +str1);
		System.out.println("str2: "+str2);
		
		int[] ary1 = {1,2,3}; // int배열 만듬
		int[] ary2 = ary1; // ary2에 복사
		ary2[1]= 10; //ary2를 바꿧음
		System.out.println(ary1[1]); //근데 이새기가 ary1을 바꿔버리는거임!! 
		// 이 이유는 참조타입은 같은 값을 대입받는다면 둘 중 무엇의 값을 바꾸어도 전체의 값이 바뀌게 되기 때문이다.
		// 쉽게 생각하면 진욱에게 니 친구는 현태다 라고 하고
		// 우서에게 니 친구는 현태다 라고 한 뒤 
		// 우서한테 현태 성형수술 시키라고 명령을 내린 뒤
		// 진욱에게 현태를 데려오라고 하면
		// 진욱이 데려오는 현태도 성형수술 돼서 나타나는것과 같은원리임.
		// 그래서 결국 ary1 은 진욱
		// ary2는 우서
		// 배열은 현태인것임.
		// 그래서 둘은 같은 인간을 참조하고 있는것이고,
		// 한 쪽의 데이터를 변경시키면 다른쪽의 데이터도 성형돼서 나오는것이다.
		
		//int[] ary3 = null;
		//System.out.println(ary3.length);
		
		String strA = new String("신용권");
		String strB = new String("신용권");
		
		//strB = "이것이 자바다";
		System.out.println(strA);
		System.out.println(strB);
		if(strA.equals(strB)) {
			System.out.println("해당 객체는 같습니다.");
		}else{
			System.out.println("해당 객체들은 다르다임마");
		}
		//new 연산자를 사용하면 내부적으로 다른 메모리 주소를 할당하기 때문에
		//두 스트링이 같냐고 단순 비교를 하게 된다면 서로 다른 메모리 주소로 비교를 하게 되고 
		//즉 두 객체는 다르다는 결론이 난다.
		//즉 ==는 메모리값의 비교가 되는 것이고, 
		//이 경우 equals는 문자열의 값을 비교하게 되기 때문에 equals 메서드를 사용해야한다. 
	}
}
