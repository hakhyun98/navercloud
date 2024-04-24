package selectionsort;

public class Sort {
	public static int[] sort(int[] sortArray) {
		int min;
		int temp;
		
		for(int i = 0; i < sortArray.length - 1; i++) {
			min = i;
			for(int j = i+1; j < sortArray.length; j++) {
				if(sortArray[min]>sortArray[j]) {
					min = j;
				}
			}
			temp = sortArray[min];
			sortArray[min] = sortArray[i];
			sortArray[i] = temp;
			System.out.print("Sorted Data " + (i+1) + " 단계 : ");
			for(int k = 0; k < sortArray.length; k++) {
				System.out.print(sortArray[k] + " ");
			}
			System.out.println(" ");
		}
		
		return sortArray;
	}
}
	
