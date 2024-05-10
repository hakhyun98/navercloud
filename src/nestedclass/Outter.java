package nestedclass;

public class Outter {
	String field1 = "Outter-field";

	void method() {
		System.out.println("Outter-method");
	}

	class Intter {
		String field2 = "Intter-field";

		void method() {
			System.out.println("Intter-method");
		}

		void print() {
			System.out.println(this.field2);
			this.method();
			System.out.println(Outter.this.field1);
			Outter.this.method();
		}
	}
}
