package dp_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsetDifferenceProblem {

    private static boolean dp[][];

    private static int minDiffSubset(int ar[]) {

        int sum = Arrays.stream(ar).sum();
        int n = ar.length;
        dp = new boolean[n + 1][sum + 1];
        subsetSum(ar, sum, n);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=sum/2;i++){
            if(dp[n][i]){
                list.add(i);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            min = Math.min(min, Math.abs((sum-list.get(i))-list.get(i)));
        }
        return min;
    }

    private static void subsetSum(int ar[], int sum, int n) {

        for (int i = 0; i <= n; i++)
            dp[i][0] = true;
        for (int j = 1; j <= sum; j++)
            dp[0][j] = false;

            for(int i=1;i<=n;i++){
                for(int j=1;j<=sum;j++){
                    
                    if(ar[i-1] > j) 
                    dp[i][j]=dp[i-1][j];
                    else{
                        dp[i][j]=dp[i-1][j-ar[i-1]]||dp[i-1][j];
                    }
                }   
            }

            printDpMatrix(n+1, sum+1);

    }

    static void printDpMatrix(int row,int col){
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println("\n");
        }
    } 

    public static void main(String[] args) {

        int ar[] = {1, 6, 11, 5};
        //int ar[] = {3, 1, 4, 2, 2, 1};
        int min = minDiffSubset(ar);
        System.out.println("Minimum subset difference == "+min);
    }

}
