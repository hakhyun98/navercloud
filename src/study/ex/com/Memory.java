package study.ex.com;

public class Memory { // new 는 heap 메모리를 만들어 주소 할당을 한 후 그 주소값을 리턴하는 것.
	public static void main(String[] args) {
		String cat = "고양이";
		String dog = "고양이";

		if (cat == dog) {
			System.out.println("cat와 dog는 참조가 같다.");
		} else {
			System.out.println("cat와 dog는 참조가 다르다.");
		}

		if (cat.equals(dog)) {
			System.out.println("cat와dog는 문자열이 같음.");
		}

		String cat1 = new String("고양이1");
		String dog1 = new String("고양이1");

		if (cat1 == dog1) {
			System.out.println("cat1과 dog1은 참조가 같다.");
		} else {
			System.out.println("cat1과 dog1은 참조가 다르다.");
		}

		if (cat1.equals(dog1)) {
			System.out.println("cat1과 dog1은 문자열이 같음.");
		}
		
		System.out.println("cat : "+ System.identityHashCode(cat)); //String객체를 new없이 생성하고 데이터가 같으면
		System.out.println("dog : "+ System.identityHashCode(dog)); //같은 주소로 할당
		
		System.out.println("cat1 : "+ System.identityHashCode(cat1)); //String객체를 new로 생성하면 데이터가 같아도
		System.out.println("dog1 : "+ System.identityHashCode(dog1)); //다른 주소로 할당
	}
}
