package arrays;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {

        int ar[] = { 1, 2, 3, 4, 5, 6 };
        int arr[] = { 3,2,1 };
        int k = 0;
        for (int i = 0; i <= 2; i++) {
            ar[i]=arr[k];
            ++k;
        }

        Arrays.stream(ar).forEach(e->System.out.println(e));
    }

}
