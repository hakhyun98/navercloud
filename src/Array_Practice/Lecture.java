package Array_Practice;

import java.util.Scanner;

public class Lecture {
//	int lecuterNo;
//	String lectureNm;
//	String lecturePf;
//	String lectureBook;
	int num;
	String[] data;

	Lecture(int num, String[] data) {
		this.num = num;
		this.data = data;
	}

	public String[] insert() {
		Scanner sc = new Scanner(System.in);

		System.out.println("데이터 수: ");
		int num = sc.nextInt();

		String[] data = new String[num];

		for (int i = 0; i < data.length; i++) {
			System.out.print((i + 1) + "번의 데이터 : " + "\n");
			data[i] = sc.next();
		}

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}

		sc.close();
		return data;
	}
}
