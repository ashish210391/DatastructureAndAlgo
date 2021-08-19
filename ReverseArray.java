package lovebabbar;

import java.util.Arrays;

public class ReverseArray {

	static void reverseArray(int ar[], int start, int end) {

		if (start >= end) {
			return;
		}
		int temp = ar[start];
		ar[start] = ar[end];
		ar[end] = temp;
		reverseArray(ar, ++start, --end);

	}

	static void printReversedArray(int ar[]) {
		Arrays.stream(ar).forEach(System.out::println);
	}

	public static void main(String[] args) {
		// int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// int ar[]= {1,2};
		int ar[] = { 1 };
		reverseArray(ar, 0, ar.length - 1);
		printReversedArray(ar);
	}
}
