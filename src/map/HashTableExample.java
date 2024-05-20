package map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();

		Thread threadA = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};

		Thread threadB = new Thread() {
			@Override
			public void run() {
				for (int i = 1000; i < 2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};

		threadA.start();
		threadB.start();

		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
		}

		int size = map.size();
		System.out.println("총 엔트리 수: " + size);
	}
}