package comparable;

import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());

		treeSet.add(new Fruit("포도", 2000));
		treeSet.add(new Fruit("사과", 3000));
		treeSet.add(new Fruit("바나나", 4000));

		for (Fruit fruit : treeSet) {
			System.out.println(fruit.name + " : " + fruit.price);
		}
	}
}
