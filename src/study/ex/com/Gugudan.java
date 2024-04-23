package study.ex.com;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		for (int i = 1; i < 9; i++) {
			System.out.println((i + 1) + "단");
			for (int j = 1; j < 10; j++) {
				System.out.print((i + 1) + "*" + j + "=" + ((i + 1) * j) + "\t");
			}
			if(i == 8) {
				break;
			}
			System.out.println("\n***********************");
		}
	}
}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("알고 싶은 구구단의 숫자를 적으세요 : ");
//		int num = sc.nextInt();
//		System.out.println(num + "단");
//		for(int i=1; i<10; i++) {
//			System.out.print(num + "x" + i + '=' + (num*i) + '\t');
//		}
//		sc.close();
//	}
//}