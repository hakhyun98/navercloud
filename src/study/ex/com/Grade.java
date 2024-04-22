package study.ex.com;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요 : ");
		int score = sc.nextInt();
		char grade;

		if (score >= 90 && score <= 100) {
			grade = 'A';
		} else if (score >= 80 && score < 90) {
			grade = 'B';
		} else if (score >= 70 && score < 80) {
			grade = 'C';
		} else if (score >= 60 && score < 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		switch (grade) {
		case 'A':
			System.out.println("최우수 학생 입니다.");
			break;
		case 'B':
			System.out.println("우수 학생 입니다.");
			break;
		case 'C':
			System.out.println("보통 학생 입니다.");
			break;
		case 'D':
			System.out.println("하위 학생 입니다.");
			break;
		case 'F':
			System.out.println("최하위 학생 입니다.");
			break;
		default:
			System.out.println("성적을 입력하세요");
			break;
		}
		sc.close();
	}
}
