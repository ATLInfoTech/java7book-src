package ch08;

public class EnumMethodTest {

	public static void main(String[] args) {
		State[] values = State.values();
		for (State state : values) {
			System.out.println("��� State�� �̸� = " + state.name());
		}
		State state = State.valueOf("INIT");
		System.out.println("�̸��� INIT�� State = " + state);
	}
}
