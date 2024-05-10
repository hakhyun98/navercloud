package inheritance.casting;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "field1";
		parent.field2 = "field2";
//		parent.field3="field3";

		System.out.println(parent.field1 + "\n" + parent.field2);

		parent.method1();
		parent.method2();
//		parent.method3();

		Child child = (Child) parent;
		child.field1 = "child-field1";
		child.field3 = "field3";

		System.out.println(child.field1 + "\n" + child.field3);

		child.method1();
		child.method3();

	}
}
