package ch12;

import java.util.Random;

public class RandomSample {

	public static void main(String[] args) {
		randomNoSeed();
		randomUsingSeed();
	}
	
	private static void randomNoSeed() {
		System.out.println("시간 값을 seed로 사용");
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
	}
	
	private static void randomUsingSeed() {
		System.out.println("100을 seed로 사용");
		Random random = new Random(100);
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());

	}
}
