package thread;

public class InterruptExample {
	public static void main(String[] args) {
		Thread th = new PrintThread();
		th.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		th.interrupt();
	}
}
