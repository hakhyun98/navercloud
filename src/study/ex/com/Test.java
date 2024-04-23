package study.ex.com;

public class Test {

	public static void main(String[] args) {
		int[] myArray = new int[] {1,2,3};// heap 영역에 myArray할당
		checkArray(myArray);
	}
	
	public static void checkArray(int[] yourArray) {
		System.out.println(yourArray[2]);
	}

}
