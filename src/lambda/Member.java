package lambda;

public class Member {
	String id;
	String name;

	public Member(String id) {
		this.id = id;
		System.out.println("Member(String id)");
//		System.out.println();
	}

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Member(String id, String name)");
	}

	@Override
	public String toString() {
		String info = "[id: " + id + ",name: " + name + "]";
		return info;
	}

}
