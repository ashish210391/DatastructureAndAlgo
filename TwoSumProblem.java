package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    


    private static boolean isTwoSumPresentWithHashing(int ar[],int sum){

        int len = ar.length-1;


        Map<Integer,Integer> map = new HashMap<>();

        
        for(int i=0;i<len;i++){

            int diff = sum - ar[i];
            if(!map.containsKey(diff)){
                map.put(ar[i], i);
            }else{
                System.out.println(i+" , "+map.get(diff));
                return true;
            }
        }
        return false;
    }

    private static boolean isTwoSumPresent2PointerApproach(int ar[],int sum){

        int start = 0;
        int end = ar.length-1;

        Arrays.sort(ar);
        while(start<end){
            if(ar[start]+ar[end] == sum){
                System.out.println("Elements are "+ar[start]+" , "+ar[end]);
                    return true;
            }
            else if (ar[start]+ar[end]>sum)
            end--;
            else if(ar[start]+ar[end]<sum)
            start++;
        }


        return false;
    }

    public static void main(String[] args) {

        int ar[] = {2,6,5,8,11};
        if(isTwoSumPresentWithHashing(ar, 14)){
            System.out.println("Sum is present");
        }
        else{
            System.out.println("Sum is not present");
        }

        System.out.println("2 pointer approach");
        if(isTwoSumPresent2PointerApproach(ar, 14))
        System.out.println("Sum is present");
        else
        System.out.println("Sum is not present");
    }
}
