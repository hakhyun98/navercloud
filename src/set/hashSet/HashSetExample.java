package set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("김");
		set.add("학");
		set.add("현");
		set.add("김"); // "김"이 중복으로 저장되지 않믕
		set.add("핵");
		set.add("뉴");

		int size = set.size();
		System.out.print(size);
	}
}
