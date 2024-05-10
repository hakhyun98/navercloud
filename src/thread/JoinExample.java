package thread;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();

		try {
			sumThread.join(); // 메인스레드 일시정지 -> SumThread의 run()이 끝나면 메인스레드 실행
		} catch (InterruptedException e) {
		}

		System.out.println("1부터 100까지 합 : " + sumThread.getSum());
	}
}
