package arrays;

public class MaximumSubArraySumProblem {


    public static int maxSumSubArray(int ar[]){

        int curr_sum=ar[0];
        int overall_sum= ar[0];

        for(int i=1;i<ar.length;i++){
           curr_sum= curr_sum>0?curr_sum+ar[i]:ar[i];
            overall_sum=curr_sum>overall_sum?curr_sum:overall_sum;
        }

        return overall_sum;
    }

    public static void main(String[] args) {
        int ar[] = {4,3,-2,6,7,-10,-10,4,5,9,-3,4,7,-28,2,9,3,2,11};
        int max_sum = maxSumSubArray(ar);
        System.out.println("Maximum sum == "+max_sum);
    }
    
}
