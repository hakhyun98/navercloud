package api;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
//		Integer obj1 = new Integer("100");
//		Integer obj2 = new Integer("200");
		
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf("200");
		
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
	}
}
