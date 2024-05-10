package exception;

public class ExceptionExample {
	public void method1() {
		try {
			method2();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void method2() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}
}
