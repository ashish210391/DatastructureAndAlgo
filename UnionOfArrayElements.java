package lovebabbar;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArrayElements {

	public static int union(int ar1[], int ar2[]) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < ar1.length; i++)
			set.add(ar1[i]);
		for (int i = 0; i < ar2.length; i++)
			set.add(ar2[i]);

		return set.size();
	}

	public static void main(String[] args) {

		int ar1[] = { 1, 2, 3, 4, 5, 6 };
		int ar2[] = { 7, 8, 1, 2, 3 };
		int unionCount = union(ar1, ar2);
		System.out.println("union set size = " + unionCount);

	}

}
