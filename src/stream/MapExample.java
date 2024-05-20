package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
	public static void main(String[] args) {
//		List<Student> studentList = new ArrayList<>();
//		studentList.add(new Student("홍길동", 85));
//		studentList.add(new Student("홍길남", 70));
//		studentList.add(new Student("홍길녀", 90));
//
//		studentList.stream().mapToInt(s -> s.getScore()).forEach(score -> System.out.println(score));
		int[] arr = { 1, 2, 3, 4, 5 };

		IntStream intStream = Arrays.stream(arr);
		intStream.asDoubleStream().forEach(d -> System.out.println(d));

		System.out.println();

		intStream = Arrays.stream(arr);
		intStream.boxed().forEach(obj -> System.out.println(obj.intValue()));
	}
}
