package ch07;

public class Calculator {

	public int divide(int op1, int op2) throws Exception {
		if (op2 == 0) {
			throw new Exception("op2�� 0�̸� �� �˴ϴ�.");
		}
		return op1 / op2;
	}
}
