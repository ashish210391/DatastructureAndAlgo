package lovebabbar;

public class MinimumAndMaximumOfArray {

	private static int max;
	private static int min;

	static void minMax(int ar[]) {

		int len = ar.length;
		int start = 0;
		if (len % 2 == 0) {
			max = ar[1];
			min = ar[0];
			start = 1;
		} else {
			max = ar[0];
			min = ar[0];
			start = 0;
		}

		for (int i = start + 1; i < len - 1; i += 2) {
			if (ar[i] < ar[i + 1]) {
				max = ar[i + 1] > max ? ar[i + 1] : max;
				min = ar[i] < min ? ar[i] : min;
			} else {
				max = ar[i] > max ? ar[i] : max;
				min = ar[i + 1] < min ? ar[i + 1] : min;
			}
		}
	}
	
	static void minMaxRec(int ar[],int i,int j,int len) {
		
		if(j==len) {
			return;
		}
		
		
	}

	public static void main(String[] args) {

		int ar[] = { 2, 4, 1, 5, 6, 0, 8, 7, 9,-1 };
		minMax(ar);
		System.out.println("max and min of array are : " + max + "," + min);
	}
}
