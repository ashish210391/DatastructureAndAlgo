package lovebabbar;

import java.util.Arrays;

public class InsertionSort {

    private static void insertionSort(int ar[]) {

        int len = ar.length;
        for (int i = 0; i <= len - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (ar[j] < ar[j - 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = temp;
                }
            }
        }

    }

    private static void printSortedArray(int ar[]) {
        Arrays.stream(ar).forEach(System.out::println);
    }

    public static void main(String[] args) {

        int ar[] = { 6, 5, 4, 3, 2, 1 };
        insertionSort(ar);
        System.out.println("After sorting ");
        printSortedArray(ar);

    }

}
