package CodingProject;

public class Member {
	public static void main(String[] args) {
		MemberInfo member1 = new MemberInfo("SHKIM", "010-9999-7777", "컴퓨터", 2, "shkim@gmail.com", "2000-10-11", "서울");
		MemberInfo member2 = new MemberInfo("JJKIM", "010-1111-3333", "컴퓨터", 2, "jjkim@gmail.com");

		printInfo(member1);
		printInfo(member2);
	}

	public static void printInfo(MemberInfo member) {
		System.out.println("이름 :" + member.name);
		System.out.println("전화번호 :" + member.phone);
		System.out.println("전공 :" + member.major);
		System.out.println("학년 :" + member.grade);
		System.out.println("이메일 :" + member.email);
		System.out.println("생일 :" + member.birth);
		System.out.println("주소 :" + member.address);
		System.out.println("--------------------------");
	}
}
