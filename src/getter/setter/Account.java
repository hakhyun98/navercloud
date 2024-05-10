package getter.setter;

public class Account {
	private String name;
	private String no;
	private long balance;

	public Account(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
	}

	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public long getBalance() {
		return balance;
	}

	void deposit(long k) {
		balance = balance - k;
	}
}
