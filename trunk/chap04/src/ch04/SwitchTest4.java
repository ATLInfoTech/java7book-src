package ch04;

import java.util.Random;

public class SwitchTest4 {

	public static void main(String[] args) {
		Random random = new Random();
		int mark = random.nextInt(5) + 1; // 1~5 사이 숫자 임의 생성

		switch (mark) {
		case 1:
			System.out.println("F(낙제)");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("통과");
			break;
		case 5:
			System.out.println("우수");
			break;
		}
	}
}
