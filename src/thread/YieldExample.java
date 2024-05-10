package thread;

public class YieldExample {
	public static void main(String[] args) {
		WorkThread threadA = new WorkThread("A스레드");
		WorkThread threadB = new WorkThread("B스레드");
		threadA.start();
		threadB.start();
		
		try {Thread.sleep(5000);}catch(InterruptedException e) {}
		threadA.work = false;
		try {Thread.sleep(10000);}catch(InterruptedException e) {}
		threadA.work = true;
	}
}


