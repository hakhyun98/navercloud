package inheritance.china;

public class China2 extends China{
	
	public China2(String jjajang, String jjambbong, String tangsuyuk, String rice) {
		super.jjajang = jjajang;
		super.jjambbong = jjambbong;
		super.tangsuyuk = tangsuyuk;
		super.gunmandu = gunmandu;
		super.rice = rice;
	}
	
	@Override
	public void printPrice(int i) {
		super.printPrice(i);
		System.out.println(jjajang + " 입니다.");
		System.out.println(jjambbong + " 입니다.");
		System.out.println(tangsuyuk + " 입니다.");
		System.out.println(gunmandu + " 입니다.");
		System.out.println(rice + " 입니다.");
		System.out.println("========================");
	}
}
