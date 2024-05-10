package nestedclass;

public class Main {
	public static void main(String[] args) {
		Outter out = new Outter();
		Outter.Intter in = out.new Intter();
		in.print();
	}
}
