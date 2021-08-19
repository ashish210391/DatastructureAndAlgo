package dp_problems;

public class SumOfSubset {

	private static boolean dp[][];
	private static boolean mem[][];
	private static boolean isSubsetSumPresentRecursive(int ar[], int sum, int n) {

		if (sum == 0)
			return true;
		if (n == 0)
			return false;

		boolean isIncluded = isSubsetSumPresentRecursive(ar, sum - ar[n - 1], n - 1);
		boolean isExcluded = isSubsetSumPresentRecursive(ar, sum, n - 1);

		return isIncluded || isExcluded;
		// return isSubsetSumPresentRecursive(ar, sum-ar[n-1], n-1)||
		// isSubsetSumPresentRecursive(ar, sum, n-1);

	}

	private static boolean isSubsetSumPresentTopDown(int ar[], int sum, int n) {
		
		for(int i=0;i<=n;i++) {
			dp[i][0]=true;
		}
		for(int j=1;j<=sum;j++) {
			dp[0][j]=false;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				 if (ar[i-1] <= j) {
					dp[i][j] = dp[i-1][j - ar[i - 1]] || dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		
		return dp[n][sum];
	}

	
	/*private static int isSubsetSumPresentMemoize(int ar[],int sum,int n) {
		
		
		if(sum == 0)
			return 1;
		if(n==0) return 0;
		
		int res1= isSubsetSumPresentMemoize(ar, sum, n-1);
		int res2= isSubsetSumPresentMemoize(ar, sum-ar[n-1], n-1);
		
		 //isSubsetSumPresentMemoize(ar, sum, n-1) || isSubsetSumPresentMemoize(ar, sum-ar[n-1], n-1);
		boolean isTrue;
		boolean isFalse;
		if(res1==1)
			isTrue=true;
		else if(res)
		
	}
*/	
	public static void main(String[] args) {

		int ar[] = { 2, 3, 7, 8, 10 };
		int sum = 2;
		int n = ar.length;
		dp = new boolean[n + 1][sum + 1];
		
		 /* if (isSubsetSumPresentRecursive(ar, sum, 5))
		  System.out.println("Subset is present");
		  else {
		  System.out.println("Subset is not present"); }*/
		 
		if (isSubsetSumPresentTopDown(ar, sum, 5))
			System.out.println("Subset is present");
		else {
			System.out.println("Subset is not present");
		}
		
		
	}
}

