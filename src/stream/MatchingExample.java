package stream;

import java.util.*;

public class MatchingExample {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6 };

		boolean result = Arrays.stream(arr).allMatch(a -> a % 2 == 0);
		System.out.println("모두 2의 배수인가? " + result);

		result = Arrays.stream(arr).anyMatch(a -> a % 3 == 0);
		System.out.println("3의 배수가 하나라도 있는가? " + result);

		result = Arrays.stream(arr).noneMatch(a -> a % 3 == 0);
		System.out.println("3의 배수가 없는가? " + result);
	}
}
