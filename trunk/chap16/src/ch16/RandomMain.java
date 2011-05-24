package ch16;

public class RandomMain {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RandomRunnable("t1"));
		Thread t2 = new Thread(new RandomRunnable("t2"));
		
		t1.start();
		t2.start();
	}
}
