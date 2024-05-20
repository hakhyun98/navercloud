package lambda;

public class LambdaExample {
	public static void main(String[] args) {
//		action((x, y) -> {
//			System.out.println("결과 : " + (x + y));
//		});
//
//		action((x, y) -> {
//			System.out.println("결과 : " + (x - y));
//		});
//	}
//
//	public static void action(Calculable calculable) {
//		int x = 10;
//		int y = 4;
//
//		calculable.calculate(x, y);

//		Person person = new Person();
//
//		person.action1((name, job) -> {
//			System.out.print(name + "이 ");
//			System.out.println(job + "을 합니다.");
//		});
//		person.action1((name, job) -> System.out.println(name + "이 " + job + "을 하지 않습니다."));
//
//		person.action2(word -> {
//			System.out.print("\"" + word + "\"");
//			System.out.println("라고 말합니다.");
//		});
//		person.action2(word -> System.out.println("\"" + word + "\"라고 외칩니다."));

		Person person = new Person();

		person.action((x, y) -> {
			double result = x + y;
			return result;
		});

		person.action((x, y) -> (x + y));

		person.action((x, y) -> sum(x, y));

	}

	public static double sum(double x, double y) {
		return (x + y);
	}
}
