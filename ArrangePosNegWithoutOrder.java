package lovebabbar;

import java.util.Arrays;

public class ArrangePosNegWithoutOrder {

	static void arrangePosNeg(int ar[]) {
		int len = ar.length;

		int negIndex = -1;

		for (int i = 0; i < len; i++) {
			if (ar[i] < 0 && negIndex >= 0) {
				int temp = ar[++negIndex];
				ar[negIndex] = ar[i];
				ar[i] = temp;
			}
			if (ar[i] > 0)
				continue;

			if (negIndex < 0) {
				negIndex = 0;
				int temp = ar[negIndex];
				ar[negIndex] = ar[i];
				ar[i] = temp;

			}

		}
	}

	static void twoPointerApproach(int ar[]) {

		int len = ar.length;
		int leftPtr = 0;
		int rightPtr = len - 1;
		for (int i = 0; i < len && leftPtr <= rightPtr; i++) {
			if (ar[leftPtr] < 0 && ar[rightPtr] < 0) {
				++leftPtr;
			} else if (ar[leftPtr] < 0 && ar[rightPtr] > 0) {
				++leftPtr;
				--rightPtr;
			} else if (ar[leftPtr] > 0 && ar[rightPtr] < 0) {
				swap(ar, leftPtr, rightPtr);
				++leftPtr;
				--rightPtr;
			} else {
				--rightPtr;
			}
		}
	}

	public static void swap(int ar[], int start, int end) {
		int temp = ar[start];
		ar[start] = ar[end];
		ar[end] = temp;
	}

	static void printArrangedElements(int ar[]) {
		Arrays.stream(ar).forEach(System.out::println);
	}

	public static void main(String[] args) {
		//int ar[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		// int ar[] = { 1, -2 };
		/*
		 * arrangePosNeg(ar); printArrangedElements(ar);
		 */
		//int ar[]= {12, 11, -13, 5, 6, -7, 5, -3, -6 };
		int ar[]= {-1}; 
		System.out.println("Calling two pointer method");

		twoPointerApproach(ar);
		printArrangedElements(ar);
	}

}
