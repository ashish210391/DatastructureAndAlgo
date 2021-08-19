package dp_problems;

public class CountSubsetSumProblem {

    private static int countSubsetSum(int ar[], int n, int sum) {

        if (sum == 0)
            return 1;
        if (n == 0)
            return 0;

        if (ar[n - 1] > sum)
            return countSubsetSum(ar, n - 1, sum);

        return countSubsetSum(ar, n - 1, sum) + countSubsetSum(ar, n - 1, sum - ar[n - 1]);

    }

    private static int countSubsetSumTopDown(int ar[], int n, int sum) {

        int dp[][] = new int[n + 1][sum + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = 1;

        for (int i = 1; i <= sum; i++)
            dp[0][i] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {

                if (ar[i - 1] > j)
                    dp[i][j] = dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - ar[i - 1]];
            }
        }

        return dp[n][sum];

    }

    public static void main(String[] args) {
        int ar[] = { 2, 3, 7, 8, 10 };
        int sum = 10;
        int n = ar.length;
        int count = countSubsetSum(ar, n, sum);

        System.out.println("Total subsets = " + count);

        int count1 = countSubsetSumTopDown(ar, n, sum);

        System.out.println("Total subsets = " + count1);
    }

}
