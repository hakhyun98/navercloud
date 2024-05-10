package inheritance.people;

public class StudentPrac {
	public static void main(String[] args) {
		
		Student student = new Student("홍길동","123456-1234567",1111);
		
		System.out.println("이름 : " + student.name);
		System.out.println("주민등록 번호 : " + student.ssn);
		System.out.println("학번 : " + student.studentNo);
	}
}

