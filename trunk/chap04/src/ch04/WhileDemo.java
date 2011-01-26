package ch04;

import java.util.Random;

public class WhileDemo {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while (num <= 100) {
			sum += num;
			num++;
		}
		System.out.println("1-100 гу = " + sum);
	}
}
