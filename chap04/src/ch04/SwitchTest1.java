package ch04;

import java.util.Random;

public class SwitchTest1 {

	public static void main(String[] args) {
		Random random = new Random();
		int mark = random.nextInt(5) + 1; // 1~5 사이 숫자 임의 생성

		switch (mark) {
		case 1:
			System.out.println("F");
			break;
		case 2:
			System.out.println("D");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("B");
			break;
		case 5:
			System.out.println("A");
			break;
		}
	}
}
