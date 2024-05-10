package exception;

public class ClassNotFoundExceptionExample {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("String클래스 존재");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			Class.forName("java.lang.String1");
			System.out.println("String1클래스 존재");
		}catch(ClassNotFoundException e) {
			e.getMessage();
			e.printStackTrace();
		}
//		-----------------------------------------------
		
//		ExceptionExample ex = new ExceptionExample();
//		ex.method1();
		
//		-----------------------------------------------

//		String[] array = {"100","1oo",null,"200"};
//		
//		for(int i = 0 ; i<=array.length; i++) {
//			try {
//				int value = Integer.parseInt(array[i]);
//				System.out.println("array["+i+"]: " + value);
//			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
//			}catch(NumberFormatException | NullPointerException e) {
//				System.out.println("데이터에 문제가 있음 : " + e.getMessage());
//			}
//		}
//		
//		-----------------------------------------------
		
//		try {
//			findClass();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void findClass() throws ClassNotFoundException {
//		Class.forName("java.lang.String1");
//	}
}
}
