package ch12;

import java.util.Random;

public class RandomSample {

	public static void main(String[] args) {
		randomNoSeed();
		randomUsingSeed();
	}
	
	private static void randomNoSeed() {
		System.out.println("�ð� ���� seed�� ���");
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
	}
	
	private static void randomUsingSeed() {
		System.out.println("100�� seed�� ���");
		Random random = new Random(100);
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());

	}
}
