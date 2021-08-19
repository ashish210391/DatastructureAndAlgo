package dp_problems;

public class EqualSumPartitionProblem {

	private static boolean isEqualSumPartition(int ar[], int n) {

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += ar[i];
		}

		if (sum % 2 != 0)
			return false;

		return isSumSubset(ar, n, sum / 2);
	}

	private static boolean isSumSubset(int ar[], int n, long sum) {
		if (n == 0 && sum != 0) {
			return false;
		}
		if (sum == 0)
			return true;

		if (ar[n - 1] > sum)
			return isSumSubset(ar, n - 1, sum);

		return isSumSubset(ar, n - 1, sum) || isSumSubset(ar, n - 1, sum - ar[n - 1]);
	}

	private static boolean isEqualSumPartitionTopDown(int ar[], int n) {

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += ar[i];
		}
		if (sum % 2 != 0)
			return false;

		int subsetSum = sum % 2;
		boolean dp[][] = new boolean[n + 1][subsetSum + 1];

		for (int i = 0; i <= n; i++)
			dp[i][0] = true;

		for (int i = 1; i <= subsetSum; i++)
			dp[0][i] = false;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= subsetSum; j++) {

				if (ar[n - 1] > subsetSum)
					dp[i][j] = dp[i - 1][j];
				else {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - ar[i - 1]];
				}
			}
		}

		return dp[n][subsetSum];
	}

	public static void main(String[] args) {

		int ar[] = { 1, 5, 11, 5, 2 };
		int n = ar.length;
		if (isEqualSumPartition(ar, n)) {
			System.out.println("Equal Sum partition is possible");
		} else {
			System.out.println("Equal sum partition is not possible");
		}

		if (isEqualSumPartitionTopDown(ar, n)) {
			System.out.println("Equal Sum partition is possible");
		} else {
			System.out.println("Equal sum partition is not possible");
		}
	}

}
