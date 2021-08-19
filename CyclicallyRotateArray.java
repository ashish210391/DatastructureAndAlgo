package lovebabbar;

import java.util.Arrays;

public class CyclicallyRotateArray {

	static void rotate(int ar[]) {

		int temp = ar[ar.length - 1];
		for (int i = ar.length - 1; i > 0; --i) {
			ar[i] = ar[i - 1];
		}
		ar[0] = temp;

	}

	static void printAfterRotating(int ar[]) {
		Arrays.stream(ar).forEach(System.out::print);
	}

	static void rotateByReverse(int ar[], int k) {

		int len = ar.length;
		reverse(ar, len - k, len - 1);
		reverse(ar, 0, len - k - 1);
		reverse(ar, 0, len - 1);

	}

	private static void reverse(int ar[], int start, int end) {

		while (start < end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}

	}

	public static void main(String[] args) {
		int ar[] = { 9, 8, 7, 6, 4, 2, 1, 3 };
		// int ar[] = { 1, 2, 3, 4, 5 };

		/*
		 * rotate(ar); printAfterRotating(ar);
		 */
		rotateByReverse(ar, 3);
		printAfterRotating(ar);

	}

}
