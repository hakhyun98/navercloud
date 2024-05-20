package stream;

import java.util.ArrayList;
import java.util.List;

public class FilterlingExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("홍길동");
		list.add("홍길남");
		list.add("홍길녀");
		list.add("김길동");

		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();

		list.stream().filter(n -> n.startsWith("홍")).forEach(n -> System.out.println(n));
		System.out.println();

		list.stream().distinct().filter(n -> n.startsWith("홍")).forEach(n -> System.out.println(n));
	}
}
