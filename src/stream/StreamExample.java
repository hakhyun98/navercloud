package stream;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) throws Exception {
//		List<Product> list = new ArrayList<>();
//		for (int i = 1; i <= 10; i++) {
//			Product product = new Product(i, "상품" + i, "NCP", (int) (10000 * Math.random()));
//			list.add(product);
//		}
//
//		Stream<Product> stream = list.stream();
//		stream.forEach(p -> System.out.println(p));

		// String[] strArray = { "홍길동", "홍길순", "홍길자" };
//		Stream<String> strStream = Arrays.stream(strArray);
//		strStream.forEach(item -> System.out.print(item + ","));
//		System.out.println();
//
//		int[] intArray = { 1, 2, 3, 4, 5 };
//		IntStream intStream = Arrays.stream(intArray);
//		intStream.forEach(item -> System.out.print(item + ","));
//		System.out.println();

		Path path = Paths.get(StreamExample.class.getResource("test.txt").toURI());
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line -> System.out.println(line));
		stream.close();
	}
}
