package comparable;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();

		treeSet.add(new Person("홍길동", 1));
		treeSet.add(new Person("홍길남", 2));
		treeSet.add(new Person("홍길녀", 3));

		for (Person person : treeSet) {
			System.out.println(person.name + " : " + person.age);
		}
	}
}
