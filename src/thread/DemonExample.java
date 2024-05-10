package thread;

public class DemonExample {
	public static void main(String[] args) {
		AutoSaveThread asThread = new AutoSaveThread();
		asThread.setDaemon(true);
		asThread.start();
		
		try {
			Thread.sleep(3000); // 프로그램이 시작된후 3초뒤 메인스레드가 종료되면 asThread도 자동 종료
		}catch(InterruptedException e) {
		}
		System.out.println("메인 스레드 종료");
	}
}
