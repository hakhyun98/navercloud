package Array_Practice;

import java.util.ArrayList;
import java.util.List;

public class Array_practice {

	public static void main(String[] args) { // static 영역 프로그램이 종료하기전까지 메모리에 유지
//		System.out.println("main 시작!"); 
//		method1();
//		System.out.println("main 종료!");
//	}
//	
//	public static void method1() {
//		System.out.println("method1 시작!");
//		Data data1 = new Data(5); // Data 객체 생성 (heap)
//		method2(data1);
//		System.out.println("method1 종료!");
//	}
//	
//	public static void method2(Data data2) {
//		System.out.println("method2 시작!");
//		System.out.println("data2 : " + data2.getValue()); // heap영역의  Data주소값을 받아온 data1을 data2에 할당
//		System.out.println("method2 종료!");
//	}

//		List<String> myList = new ArrayList<>(); // heap영역에 myList라는 List 객체 주소 할당
//		myList.add("내 이름은"); // myList[0]
//		myList.add("김학현"); // myList[1]
//		printMyList(myList); // heap영역의 myList주소값을 printMyList의 참조변수인 yourList에 할당
//		System.out.println(myList);
//	}
//
//	public static void printMyList(List<String> yourList) {
//		System.out.println(yourList);
//		String test = yourList.get(0); // yourList[0]의 주소를 받아와 test에 할당
//		yourList.add("반가워"); // myList[2]
//		System.out.println(test);
//		System.out.println(yourList);

		// 빈 문자열을 포함한 큰 크기의 문자열 배열을 선언합니다.
//        String[] stringArray = new String[1000000];
//        
//        // 각 요소에 문자열을 할당합니다.
//        for (int i = 0; i < stringArray.length; i++) {
//            stringArray[i] = "String " + i;
//        }
//        
//        // 특정 인덱스의 요소를 출력하여 확인합니다.
//        System.out.println("Element at index 500: " + stringArray[500]);
//        
//        // 메모리 누수 예제를 만들기 위해 배열에 null을 할당하지 않은 상태로 종료합니다.
//        // stringArray = null;
//        
//        // 힙 영역에 할당된 메모리를 확인하기 위해 시스템 메모리 사용량을 출력합니다.
//        long heapSize = Runtime.getRuntime().totalMemory();
//        System.out.println("Heap Size (bytes): " + heapSize);
		
//		int[] a = {5,4,3,2,1};
//		for(int i : a) {
//			System.out.println("a[i]" + a[i]);
//		}
//		
	
	}
}
