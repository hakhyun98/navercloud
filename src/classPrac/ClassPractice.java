package classPrac;

public class ClassPractice {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("s1 : " + s1);
		
		Student s2 = new Student();
		System.out.println("s2 : " + s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
}
