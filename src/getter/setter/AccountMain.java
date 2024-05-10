package getter.setter;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("계좌 명의: ");
		String name = sc.next();

		System.out.print("계좌 번호: ");
		String no = sc.next();

		System.out.print("잔고: ");
		long balance = sc.nextLong();

		Account a = new Account(name, no, balance);
		System.out.println("계좌 기본 정보 : {" + a.getName() + "," + a.getNo() + "," + a.getBalance() + "}");

		System.out.print("출금 액 : ");
		long k = sc.nextLong();

		a.deposit(k);

		System.out.println(a.getBalance());

		sc.close();
	}
}
