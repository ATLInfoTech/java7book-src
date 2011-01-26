package ch04;

public class ForDemo {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0 ; i <= 100 ; i++) {
			sum += i; // for 구문에서 선언한 변수 사용 가능
		}
		System.out.println("1-100 합 = " + sum);
	}
}
