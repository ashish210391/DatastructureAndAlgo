package dp_problems;

public class KnapsackRecursiveDemo {

	public static int maxProfit = 0;
	public static int dp[][];

	private static int knapsack(int wt[], int profit[], int w, int n) {

		if (w == 0 || n == 0)
			return 0;

		if (wt[n] > w)
			return knapsack(wt, profit, w, n - 1);

		return Math.max(profit[n] + knapsack(wt, profit, w - wt[n], n - 1), knapsack(wt, profit, w, n - 1));

	}

	private static int knapsackMemoised(int wt[], int profit[], int w, int n) {

		if (n == 0 || w == 0) {
			return 0;
		}

		if (dp[n][w] != -1) {
			return dp[n][w];
		}

		else if (wt[n - 1] > w)

			return dp[n][w] = knapsackMemoised(wt, profit, w, n - 1);

		dp[n][w] = Math.max(knapsackMemoised(wt, profit, w, n - 1),
				profit[n - 1] + knapsackMemoised(wt, profit, w - wt[n - 1], n - 1));
		System.out.println("profit == " + dp[n][w]);

		return dp[n][w];
	}

	private static int knapsackTopDown(int wt[], int profit[], int w, int n) {

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= w; j++) {

				if (i == 0 || j == 0)
					dp[i][j] = 0;

				else if (wt[i - 1] > j) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(profit[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
				}

			}
		}
		return dp[n][w];
	}

	public static void main(String[] args) {

		int wt[] = { 10, 20, 30 };
		int profit[] = { 60, 100, 120 };
		int w = 50;
		int n = wt.length;

		dp = new int[n + 1][w + 1];

		/*
		 * for (int i = 0; i <= n; i++) { for (int j = 0; j <= w; j++) { dp[i][j] = -1;
		 * } }
		 */
		// int maxProfit = knapsackMemoised(wt, profit, w, n);
		maxProfit = knapsackTopDown(wt, profit, w, n);
		System.out.println("Max profit == " + maxProfit);

	}

}
