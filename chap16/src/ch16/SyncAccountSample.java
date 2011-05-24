package ch16;

public class SyncAccountSample {

	public static void main(String[] args) {
		final SyncAccount account = new SyncAccount();
		account.deposit(5000);

		Runnable withdrawRun = new Runnable() {
			public void run() {
				boolean result = account.withdraw(3000);
				System.out.println("result=" + result + 
						", balance=" + account.getBalance());
			}
		};
		Thread t1 = new Thread(withdrawRun);
		Thread t2 = new Thread(withdrawRun);

		t1.start();
		t2.start();
	}
}
