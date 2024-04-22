package study.ex.com;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.print("과학 점수를 입력하세요 : ");
		int sci = sc.nextInt();

		int sum = math + eng + kor + sci;
		double avg = (math + eng + kor + sci) / 4;
		boolean each = (math >= 60) && (eng >= 60) && (kor >= 60) && (sci >= 60);

		if (each && (avg >= 70)) {
			System.out.println("수학점수 : " + math);
			System.out.println("영어점수 : " + eng);
			System.out.println("국어점수 : " + kor);
			System.out.println("과학점수 : " + sci);
			System.out.println("총합점수 : " + sum);
			System.out.println("평균점수 : " + avg);
			System.out.println("합격입니다!");
		} else if (!each || (avg < 70)) {
			System.out.println("수학점수 : " + math);
			System.out.println("영어점수 : " + eng);
			System.out.println("국어점수 : " + kor);
			System.out.println("과학점수 : " + sci);
			System.out.println("총합점수 : " + sum);
			System.out.println("평균점수 : " + avg);
			System.out.println("불합격입니다!");
		}
		sc.close();
	}
}
