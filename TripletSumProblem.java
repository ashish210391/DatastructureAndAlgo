package arrays;

import java.util.Arrays;

public class TripletSumProblem {


    private static boolean isTripletSumPresent(int ar[]){

        int len = ar.length-1;
        boolean tripletFound = false;
        if(len ==0||len ==1)
        return false;
        if( len == 3){
            return ar[0]+ar[1]+ar[2]==0;
        }
        Arrays.sort(ar);
        for(int i=0;i<len-2;i++){
            if(findSum(ar, i+1, len, -(ar[i]))){
                tripletFound=true;
                break;
            }
        }
        


        return tripletFound;
    }


    private static boolean findSum(int ar[],int start,int end,int sum){

        while(start<=end){
             if(ar[start]+ar[end]<sum)
                start++;
                else if(ar[start]+ar[end]>sum)
                end--;
                else{
                    return true;
                }
        }

        return false;
    }


    public static void main(String[] args) {

        int ar[] = {2,4,-1,3,-4,0,3};
        if(isTripletSumPresent(ar)){
            System.out.println("Triplet Found");
        }else{
            System.out.println("Triplet not found");
        }
    }
    
}
