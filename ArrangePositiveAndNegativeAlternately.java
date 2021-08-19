package lovebabbar;

import java.util.Arrays;

public class ArrangePositiveAndNegativeAlternately {

	static void rearrangeElements(int ar[]) {
		int len = ar.length;
		int pivot = 0;
		for (int i = 0; i < len; i++) {
			if (ar[i] < 0) {
				swapElements(ar, pivot, i);
				++pivot;
			}
		}

	}

	static void rearrangeAlternatively(int ar[]) {
		int len = ar.length;
		rearrangeElements(ar);
		int pos = getPositiveIndex(ar);
		// int neg = getNegativeIndex(ar);
		for (int i = 0; i < len; i++) {
			if (i % 2 != 0 && ar[i] < 0) {
				// swap the positive and negative element
				swapElements(ar, i, pos);
				++pos;
			}
		}

	}

	static int getNegativeIndex(int ar[]) {
		int i = 0;
		while (true) {
			if (ar[i] < 0) {
				++i;
				break;
			}
		}
		return i;
	}

	static int getPositiveIndex(int ar[]) {
		int i = 0;
		while (true) {
			if (ar[i] > 0) {
				break;
			}
			++i;
		}
		return i;
	}

	static void swapElements(int ar[], int firstEl, int secondEl) {

		int temp = ar[firstEl];
		ar[firstEl] = ar[secondEl];
		ar[secondEl] = temp;
	}

	static void printArrayElements(int ar[]) {
		Arrays.stream(ar).forEach(System.out::println);
	}

	public static void main(String[] args) {

		int ar[] = { 12, 11, -13, -5, 6, -7, 5, -3, -6 };
		//rearrangeElements(ar);
		rearrangeAlternatively(ar);
		printArrayElements(ar);

	}
}
