package com.yedam.java.ch0402;

public class BreakContinueExample {
	public static void main(String[] args) {
		// Continue => pass 같은것
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1)
				continue;
			{
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d*%d=%d\n", i, j, (i * j));
				}
			}
		}

		// 중첩 반복문에서 break문;
		for (char upper = 'A'; upper <= 'Z'; upper++) {
			boolean isEnd = false;
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				// 소문자 g일 때 반복문 종료하고 싶을 때
				if (lower == 'g') {
					isEnd = true;
					break;
				}
			}
			if (isEnd)
				break;
		}
		Butter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			boolean isEnd = false;
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				// 소문자 g일 때 반복문 종료하고 싶을 때
				if (lower == 'g') {

					break Butter;
				}
			}
		}
	}
}
