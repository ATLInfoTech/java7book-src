package ch04;

public class IncDecOperMain {

	public static void main(String[] args) {
		int value = 10;
		int value2 = value++;
		System.out.println("value �� = " + value);
		System.out.println("value2 �� = " + value2);
		
		int value3 = --value2;
		System.out.println("value2 �� = " + value2);
		System.out.println("value3 �� = " + value3);
	}
}
