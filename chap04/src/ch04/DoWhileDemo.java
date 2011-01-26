package ch04;

import java.util.Random;

public class DoWhileDemo {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while (num <= 100);
		System.out.println("1-100 гу = " + sum);
	}
}
