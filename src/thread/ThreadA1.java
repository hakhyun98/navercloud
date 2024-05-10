package thread;

public class ThreadA1 extends Thread {
	private WorkObject wo;

	public ThreadA1(WorkObject wo) {
		setName("ThreadA");
		this.wo = wo;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			wo.methodA();
		}
	}

}
