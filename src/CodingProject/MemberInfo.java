package CodingProject;

public class MemberInfo {
	
	String name;
	String phone;
	String major;
	int grade;
	String email;
	String birth;
	String address;
	
	//생일  과 주소 없는 생성자
	MemberInfo(String name, String phone, String major, int grade, String email){
//		this.name = name;
//		this.phone = phone;
//		this.major = major;
//		this.grade = grade;
//		this.email = email;
		this(name,phone,major,grade,email,"정보 없음","정보 없음");
	}
	
	// 모든 정보 생성자
	MemberInfo(String name, String phone, String major, int grade, String email, String birth, String address){
		this.name = name;
		this.phone = phone;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birth = birth;
		this.address = address;
	}
}
