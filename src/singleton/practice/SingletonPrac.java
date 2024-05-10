package singleton.practice;

public class SingletonPrac {
	public static void main(String[] args) {

//		Singleton ob1 = new Singleton();
//		Singleton ob2 = new Singleton();  Singleton 클래스의 생성자가 private으로 선언되어 객체생성 불가능

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은  Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}
