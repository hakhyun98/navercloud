package thread;

public class PrintThread extends Thread{
	public void run() {
		try {
			while(true) {
				System.out.println("실행중");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
