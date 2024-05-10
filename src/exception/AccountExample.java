package exception;

public class AccountExample {
	public static void main(String[] args) {
		Account ac = new Account();
		
		ac.deposit(60000);
		System.out.println("예금액 : " + ac.getBalance());
		
		try {
			ac.withdraw(100000);
		}catch(BalanceInsuffcientException e){
			e.getMessage();
			e.printStackTrace();
		}
	}
}
