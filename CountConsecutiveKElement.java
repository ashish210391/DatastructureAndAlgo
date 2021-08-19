package test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountConsecutiveKElement {

	private static void calculate(int ar[]) {

		int counter = 0;
		int len = ar.length;
		int indicateOne = 0;
		int count1[] = new int[15];

		for (int i = 0; i < len; i += counter) {
			counter = 0;
			for (int j = i; j < i + ar[i]; j++) {
				if (ar[i] != ar[j])
					break;
				++counter;

			}
			if (counter == ar[i]) {
				++count1[ar[i]];
			}
		}

		for (int i = 0; i < count1.length; i++) {
			if (count1[i] > 0) {
				System.out.println("Element " + i + " has count " + count1[i]);
				++indicateOne;
			}
		}
	}

	public static void main(String[] args) {

		int ar[] = { 3, 3, 2, 2, 5, 5, 5, 5, 5, 3, 3, 3, 2, 2 };
		calculate(ar);
	}

}
