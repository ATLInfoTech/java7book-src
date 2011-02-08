package ch07;

public class ZeroDevide2 {

	public static void main(String[] args) {
		int op1 = Integer.parseInt(args[0]);
		int op2 = Integer.parseInt(args[1]);
		try {
			System.out.println(op1 / op2);
		} catch (ArithmeticException e) {
			System.out.println("에러 발생: " + e.getMessage());
		}
	}
}
