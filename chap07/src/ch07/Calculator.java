package ch07;

public class Calculator {

	public int divide(int op1, int op2) throws Exception {
		if (op2 == 0) {
			throw new Exception("op2는 0이면 안 됩니다.");
		}
		return op1 / op2;
	}
}
