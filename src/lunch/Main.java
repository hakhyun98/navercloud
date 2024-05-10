package lunch;

public class Main {
	public static void main(String[] args) {
		Student1 student1 = new Student1(1,0,0);
		Student2 student2 = new Student2(0,1,1);
		
		System.out.println("Student1 식비는 " + student1.lunch() + "원 입니다.....");
		System.out.println("Student2 식비는 " + student2.lunch() + "원 입니다.....");
	}

}
