package study.ex.com;

public class KeyControll {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keycode = 0;
		while (run) {
			if (keycode != 13 && keycode != 10) {
				System.out.println("*******************");
				System.out.println("1.증가 | 2.감속 | 3.정지");
				System.out.println("*******************");
				System.out.println("선택 : ");
			}

			keycode = System.in.read();

			if (keycode == '1') {
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if (keycode == '2') {
				speed--;
				System.out.println("현재 속도 : " + speed);
			} else if (keycode == '3') {
				run = false;

			}
		}
	}
}
