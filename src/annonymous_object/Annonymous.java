package annonymous_object;

public class Annonymous {
	Person field = new Person() {
		void work() {
			System.out.println("일을 나갑니다.");
		}

		@Override
		void method() {
			System.out.println("일찍 일어 납니다.");
			work();
		}
	};

	void method1() {
		Person field2 = new Person() {
			void walk() {
				System.out.println("산책을 갑니다.");
			}

			@Override
			void method() {
				System.out.println("field2 메소드");
				walk();
			}
		};
		field2.method();
	}

	void method2(Person person) {
		person.method();
	}
}
