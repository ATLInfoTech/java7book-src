package ch18;

public class SimpleTest {

	@Test
	public void a() {
		System.out.println("a �޼��� ����");
	}

	@Test
	public void b() {
		System.out.println("b �޼��� ����");
	}

	@Test(skip = true)
	public void c() {
		System.out.println("c �޼��� ����");
	}
}
