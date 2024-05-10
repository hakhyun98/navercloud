package annonymous_object;

public class Main {
	public static void main(String[] args) {
		Annonymous ay = new Annonymous();
	
		ay.field.method();
		ay.method1();
		ay.method2(new Person() {
			@Override
			void method() {
				System.out.println("객체를 매개변수로");
			}
		});
	}
}
