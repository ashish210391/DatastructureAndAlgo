package lovebabbar;

import java.util.Arrays;

public class BubbleSort {



    private static void sort(int ar[]){

        int len = ar.length;
        int numberOfSwapsTried =0;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp = ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
                ++numberOfSwapsTried;
            }
        }
        System.out.println("Number of swaps in non-efficient sort== "+numberOfSwapsTried);

    } 

    private static void efficientBubbleSort(int ar[]){

        int len = ar.length;
        int numberOfSwapsTried=0;
        for(int i=0;i<len-1;i++){
            boolean isSorted = true;
            for(int j =0;j<len-i-1;j++){
                if(ar[j]>ar[j+1]){
                    isSorted=false;
                    int temp = ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
                ++numberOfSwapsTried;
            }
            if(isSorted){
                break;
            }
        }
        System.out.println("Number of swaps in efficient sort== "+numberOfSwapsTried);
    }
    private static void printSortedArray(int ar[]){
        Arrays.stream(ar).forEach(System.out::println);
    }
    public static void main(String[] args) {
   // int ar[] = {5,1,4,2,8};
      //  int ar[]={6,5,4,3,2,1};
     // int ar[]={6,5,7,4,8,3,9,2,10,1};
     //int ar[] = {3,2};
     int ar[]={1,2,3,4,5,6,7};
    sort(ar);
    System.out.println("After sorting the array ");
    printSortedArray(ar);        
    efficientBubbleSort(ar);
    System.out.println("After efficient sorting the array ");
    printSortedArray(ar);        

    }
    
}
