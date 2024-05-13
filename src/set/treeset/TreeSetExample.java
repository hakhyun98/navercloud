package set.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();

		scores.add(87);
		scores.add(98);
		scores.add(76);
		scores.add(90);
		scores.add(84);
		scores.add(65);

		for (Integer s : scores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");

		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("95점 아래 점수 : " + scores.lower(90));
		System.out.println("95점 위 점수 : " + scores.higher(90));
		System.out.println("95점이거나 바로 아래 점수 : " + scores.floor(90));
		System.out.println("88점이거나 바로 위 점수 : " + scores.ceiling(88));

		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for (Integer s : descendingScores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");

		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println("\n");

		rangeSet = scores.subSet(80, true, 90, false);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
	}
}
