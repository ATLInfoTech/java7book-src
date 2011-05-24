package ch16;

public class DeadLock {

	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	public void some() {
		synchronized(lock1) {
			try { Thread.sleep(500); } catch(Exception ex) {}
			any2();
		}
	}
	
	public void any() {
		synchronized(lock2) {
			try { Thread.sleep(500); } catch(Exception ex) {}
			some();
		}
	}

	private void any2() {
		synchronized(lock2) {
			// 코드 실행
		}
	}

	
	public static void main(String[] args) {
		final DeadLock deadLock = new DeadLock();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				deadLock.some();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				deadLock.any();
			}
		});
		t1.start();
		t2.start();
	}
}
