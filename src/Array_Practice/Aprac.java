package Array_Practice;

import java.util.Scanner;

public class Aprac {
	public static void main(String[] args) {
		int sum = 0;
		int max = 0;
		int min = 0;
		double avg;

		Scanner sc = new Scanner(System.in);

		System.out.println("사람 수는 몇명: ");
		int num = sc.nextInt();
		int[] people = new int[num];

		System.out.println("점수를 입력하세요 :");

		for (int i = 0; i < people.length; i++) {
			System.out.print((i + 1) + "번의 점수 : ");
			people[i] = sc.nextInt();
		}
		for (int j = 0; j < people.length; j++) {
			sum += people[j];
		}
		for (int i = 0; i < people.length - 1; i++) {
			max = i;
			for (int j = 0; j < people.length; j++) {
				if (people[max] < people[j]) {
					max = j;
				}
			}
		}
		for (int i = 0; i < people.length - 1; i++) {
			min = i;
			for (int j = 0; j < people.length; j++) {
				if (people[min] > people[j]) {
					min = j;
				}
			}
		}
		avg = (double) sum / people.length;
		System.out.println("합계는" + sum + "점입니다.");
		System.out.println("평균은" + avg + "점입니다.");
		System.out.println("최고점은" + people[max] + "점입니다.");
		System.out.println("최저점은" + people[min] + "점입니다.");
		sc.close();
	}
}
