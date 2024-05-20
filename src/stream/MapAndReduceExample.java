package stream;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("홍길동", 43), new Student("홍길남", 50),
				new Student("홍길녀", 35));

		double avg = studentList.stream().mapToInt(student -> student.getScore()).average().getAsDouble();

		System.out.print("평균 : " + avg);
	}
}
