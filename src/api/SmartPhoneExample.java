package api;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("애플","Mac Os");
		
		String str = sp.toString();
		System.out.println(str);
		
		System.out.println(sp);
	}
}
