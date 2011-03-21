package ch12;

import java.util.Arrays;

public class StringSplitSample {

	public static void main(String[] args) {
		String phone = "82-2-1200-8200";
		String[] split = phone.split("-");
		System.out.println(Arrays.toString(split));
		split = phone.split("-|0");
		System.out.println(Arrays.toString(split));
		split = phone.split("-|0", 0);
		System.out.println(Arrays.toString(split));
		split = phone.split("-|0", 3);
		System.out.println(Arrays.toString(split));
		split = phone.split("-|0", -1);
		System.out.println(Arrays.toString(split));
	}
	
}
