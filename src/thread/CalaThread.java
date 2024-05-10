package thread;

public class CalaThread extends Thread{
	public CalaThread(String name) {
		setName(name);
	}
	
	public void run() {
		for(int i = 0; i<200000000; i++) {
			for(int j=0; j<20; j++) {}
		}
		System.out.println(getName());
	}

}
