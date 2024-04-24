package selectionsort;

public class Main {
	public static void main(String[] args) {
		int[] inArray = {69,10,30,2,16,8,31,22};
		System.out.print("Input Data : " );
		for(int i = 0; i < inArray.length; i++) {
			System.out.print(inArray[i] + " ");
		}
		System.out.println("");
		Sort.sort(inArray);
	}
}

