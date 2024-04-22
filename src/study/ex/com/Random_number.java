package study.ex.com;

import java.util.Scanner;

public class Random_number {
	public static void main(String[] args) throws Exception {
		while (true) {
			int ran = (int) (Math.random() * 10) + 1;
//			System.out.println(ran);

			Scanner sc = new Scanner(System.in);
			System.out.print("1~10 의 숫자를 적으세요 : ");
			int num = sc.nextInt();

			if (num != ran) {
				System.out.println("다시 입력하세요");
			}
			if (num == ran) {
				System.out.println("맞췄습니다!");
				break;
			}
		}
	}
}
