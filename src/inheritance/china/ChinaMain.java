package inheritance.china;

public class ChinaMain {
	public static void main(String[] args) {

		China ch1 = new China1("7,000원", null);
		China ch2 = new China2("5,000원", "5,000원", "10,000원", "무료");
		China ch3 = new China3("7,000원", "7,000원");

		ch1.printPrice(1);
		ch2.printPrice(2);
		ch3.printPrice(3);
	}
}
