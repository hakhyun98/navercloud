package lambda;

public class Person {
//	public void action(Workable workable) {
//		workable.work();
//
//	}

//	public Member getMemeber1(Creatable1 creatable) {
//		String id = "winter";
//		Member member = creatable.create(id);
//		return member;
//	}
//
//	public Member getMember2(Creatable2 creatable) {
//		String id = "winter";
//		String name = "한겨울";
//		Member member = creatable.create(id, name);
//		return member;
//
//	}
//	public void action1(Workable workable) {
//		workable.work("홍길동", "프로그래밍");
//	}
//
//	public void action2(Speakable speakable) {
//		speakable.speak("안녕하세요");
//	}

	public void action(Calculable calculable) {
		double result = calculable.calculate(10, 4);
		System.out.println("결과: " + result);
	}
}
