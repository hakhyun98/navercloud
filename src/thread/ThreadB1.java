package thread;

public class ThreadB1 extends Thread {
	private WorkObject wo = new WorkObject();

	public ThreadB1(WorkObject wo) {
		setName("ThreadB");
		this.wo = wo;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			wo.methodB();
		}
	}

}
