package arrays;

import java.util.Arrays;

public class QuickSort {

    private static int partition(int ar[], int low, int high) {

        int i = low;
        int pivot = ar[low];
        int j = high;
        while (i < j) {
            while (i<=high  && ar[i] <= pivot )
                i++;
            while ( j>=0  && ar[j] > pivot)
                j--;
            if (i < j)
                swap(ar, i, j);
        }

        swap(ar, low, j);

        return j;
    }

    private static void swap(int ar[], int index1, int index2) {

        int temp = ar[index1];
        ar[index1] = ar[index2];
        ar[index2] = temp;
    }

    private static void quickSort(int ar[], int low, int high) {

        if (low < high) {
            int partition = partition(ar, low, high);
            quickSort(ar, low, partition-1);
            quickSort(ar, partition + 1, high);
        }
    }

    public static void main(String[] args) {
        //int ar[] = { 6, 5, 4, 3, 2, 1 };
        int ar[] ={7,9,4,8,3,6,2,1};
        quickSort(ar, 0, ar.length - 1);
        Arrays.stream(ar).forEach(System.out::println);
    }

}
