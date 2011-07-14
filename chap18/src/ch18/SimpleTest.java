package ch18;

public class SimpleTest {

	@Test
	public void a() {
		System.out.println("a 메서드 실행");
	}

	@Test
	public void b() {
		System.out.println("b 메서드 실행");
	}

	@Test(skip = true)
	public void c() {
		System.out.println("c 메서드 실행");
	}
}
