package Array_Practice;

public class ArrayReference {
	public static void main(String[] args) {
		String[] myArray = new String[3];
		myArray[0] = "김";
		myArray[1] = "김";
		myArray[2] = new String("김");
		
		System.out.println(myArray[0] == myArray[1]);
		System.out.println(myArray[0] == myArray[2]);
		System.out.println(myArray[1] == myArray[2]);
		System.out.println(myArray[0].equals(myArray[2]));
	}
}
