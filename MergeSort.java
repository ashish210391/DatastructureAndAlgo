package arrays;

import java.util.Arrays;

public class MergeSort {
    

    private static void mergeSort(int ar[],int left,int right){
        while(left<right)
        {
            int mid = (left+right)/2;
            mergeSort(ar, left, mid);
            mergeSort(ar, mid+1, right);
            merge(ar, left, mid, right);

        }

    }


    private static void merge(int ar[],int left,int mid,int right ){

        int i = left;
        int j = mid+1;
        int k = left;
        int tempAr[] = new int[right+1];
        while(i<=mid && j<=right){

            if(ar[i]>ar[j]){
                tempAr[k]=ar[j];
                i++;
                k++;
            }else if(ar[i]<ar[j]){
                tempAr[k]=ar[j];
                j++;
                k++;
            }
        }


        if(i<=mid){
        while(i<=mid){
                tempAr[k]=ar[i];
                ++i;
                ++k;
            }
        }

        if(j<=right){
            while(j<=right){
                tempAr[k]=ar[j];
                ++j;
                ++k;

            }
        }
        

    for( k=left;k<=right;k++){
        ar[k]=tempAr[k];
    }
    }


    public static void main(String[] args) {
        int ar[]  = {4,2,1,5,6,3};
        mergeSort(ar,0, ar.length-1);
        System.out.println("After sorting the array");
        Arrays.stream(ar).forEach(System.out::println);
    }


}
