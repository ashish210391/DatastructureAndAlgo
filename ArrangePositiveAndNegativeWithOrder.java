package lovebabbar;

import java.util.Arrays;

public class ArrangePositiveAndNegativeWithOrder {

	static void arrangePosNeg(int ar[]) {

		int len = ar.length;
		int j = 0;
		for (int i = 0; i < len; i++) {
			if (ar[i] < 0) {
				j = i;
				while (j > 0 && ar[j - 1] > 0) {
					int temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
					--j;
				}
			}
		}

	}
	
		

	static void printArrangedArray(int ar[]) {
		Arrays.stream(ar).forEach(System.out::println);
	}

	public static void main(String[] args) {

		int ar[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
		arrangePosNeg(ar);
		printArrangedArray(ar);
	}

}
