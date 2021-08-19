package dp_problems;

public class Solution {
    public  static int solve(int[] A) {
    int n = A.length;
    int sum=0;
    for(int i=0;i<n;++i)
        sum+=A[i];
    
    //Subset Sum Problem
    boolean[][] dp = new boolean[n+1][sum+1];
    for(int i=0;i<=n;++i)
    for(int j=0;j<=sum;++j)
    {
        if(j==0)
            dp[i][j] = true;
        else if(i==0)
            dp[i][j] = false;
        else if(A[i-1]>j)
            dp[i][j] = dp[i-1][j];
        else
            dp[i][j] = dp[i-1][j] || dp[i-1][j-A[i-1]];
    }

    printDpMatrix(n+1,sum+1,dp);

    
    int diff = Integer.MAX_VALUE;
    for(int i=0;i<=sum/2;++i)
    {
        int first = i;
        int second = sum-i;
        if(dp[n][i]==true && diff>Math.abs(first-second))
            diff = Math.abs(first-second);
    }
    
    return diff;
    }


    static void printDpMatrix(int row,int col,boolean [][] dp){
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println("\n");
        }
    } 

    public static void main(String[] args) {
        int ar []= {3, 1, 4, 2, 2, 1};
        int diff = solve(ar);
        System.out.println("Min difference == "+diff);
    }
}