package lovebabbar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class IntersectionOfArray {
	private static int countSet = 0;

	static void intersection(int ar1[], int ar2[]) {

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < ar1.length; i++) {
			set.add(ar1[i]);
		}
		for (int i = 0; i < ar2.length; i++) {
			if (!set.add(ar2[i])) {
				System.out.println	(ar2[i]);
				++countSet;
			}
		}
	}

	public static void main(String[] args) {
		int ar1[] = { 1, 2, 3, 4, 5, 6 };
		int ar2[] = { 7, 8, 1, 2, 3 };
		intersection(ar1, ar2);
		System.out.println("intersection set count: " + countSet);
	}

}
