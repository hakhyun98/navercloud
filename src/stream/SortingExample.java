package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("홍길남", 50));
		studentList.add(new Student("홍길녀", 10));

		studentList.stream().sorted().forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));

		System.out.println();

		studentList.stream().sorted(Comparator.reverseOrder())
				.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}
}
