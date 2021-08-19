package arrays;

import java.util.Arrays;

public class MergeSortRevision {
    

    private static void mergeSort(int ar[],int low,int high){

        if(low<high){
            int mid = (low+high)/2;
            mergeSort(ar, low, mid);
            mergeSort(ar, mid+1, high);
            merge(ar, low, mid, high);    
        }
    }

    private static void merge(int ar[],int low,int mid,int high){
        int i = low;
        int j =mid+1;
        int k =0;

        int temp[] = new int[high+1];
        while(i<=low && j <=high){
            if(ar[i]<ar[j]){
                temp[k]=ar[i];
                ++k;
                ++i;
            }
            else{
                temp[k]=ar[j];
                ++k;
                ++j;
            }
        }

        if(i<=mid){
            while(i<=mid){
                temp[k]=ar[i];
                ++k;
                ++i;
            }
        }

        if(j<=high){
            while(j<=high){
                temp[k]=ar[j];
                ++k;
                ++j;
            }
        }

        k=0;
        for(int c=low;c<=high;c++){
            ar[c]=temp[k];
            ++k;
        }
    }


    public static void main(String[] args) {
    int ar[] = {6,5,4,3,2,1};
    mergeSort(ar, 0,ar.length-1);
    Arrays.stream(ar).forEach(System.out::println);

    }
}
