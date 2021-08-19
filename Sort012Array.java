package lovebabbar;

import java.util.Arrays;

public class Sort012Array {

	static void sort012(int ar[]) {

		int countZero = 0;
		int countOne = 0;
		int countTwo = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0)
				++countZero;
			if (ar[i] == 1)
				++countOne;
			if (ar[i] == 2)
				++countTwo;

		}

		for (int j = 0; j < ar.length; j++) {
			if (countZero > 0) {
				ar[j] = 0;
				--countZero;
			} else if (countOne > 0) {
				ar[j] = 1;
				--countOne;
			} else if (countTwo > 0) {
				ar[j] = 2;
				--countTwo;
			}
		}

	}

	static void printSortedArray(int ar[]) {

		Arrays.stream(ar).forEach(System.out::println);
	}

	public static void main(String[] args) {
		//int ar[] = { 0, 2, 1, 2, 0 };
		int ar[]= {0,1,1,1,1,0};
		sort012(ar);
		printSortedArray(ar);
	}

}
