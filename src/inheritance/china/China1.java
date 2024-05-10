package inheritance.china;

public class China1 extends China {

	public China1(String jjajang, String gunmandu) {
		super.jjajang = jjajang;
		super.jjambbong = jjambbong;
		super.tangsuyuk = tangsuyuk;
		super.gunmandu = gunmandu;
		super.rice = rice;
	}

	@Override
	public void printPrice(int i) {
		if (gunmandu == null) {
			super.printPrice(i);
			System.out.println(jjajang + " 입니다.");
			System.out.println(jjambbong + " 입니다.");
			System.out.println(tangsuyuk + " 입니다.");
			System.out.println("판매하지 않습니다.");
			System.out.println(rice + " 입니다.");
			System.out.println("========================");
		} else {
			super.printPrice(i);
			System.out.println(jjajang + " 입니다.");
			System.out.println(jjambbong + " 입니다.");
			System.out.println(tangsuyuk + " 입니다.");
			System.out.println(gunmandu + " 입니다.");
			System.out.println(rice + " 입니다.");
			System.out.println("========================");
		}
	}
}
