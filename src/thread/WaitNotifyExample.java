package thread;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject wo = new WorkObject();
		
		ThreadA1 t1 = new ThreadA1(wo);
		ThreadB1 t2 = new ThreadB1(wo);
		
		t1.start();
		t2.start();
	}
}
