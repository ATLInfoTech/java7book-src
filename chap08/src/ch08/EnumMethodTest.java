package ch08;

public class EnumMethodTest {

	public static void main(String[] args) {
		State[] values = State.values();
		for (State state : values) {
			System.out.println("모든 State의 이름 = " + state.name());
		}
		State state = State.valueOf("INIT");
		System.out.println("이름이 INIT인 State = " + state);
	}
}
