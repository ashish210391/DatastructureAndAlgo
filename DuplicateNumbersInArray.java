package lovebabbar;

public class DuplicateNumbersInArray {

	private static void findDuplicateNumbers(int ar[]) {

		int len = ar.length;
		for (int i = 0; i < len; i++) {
			if (ar[Math.abs(ar[i])] > 0) {
				ar[Math.abs(ar[i])] = -ar[Math.abs(ar[i])];
			} else {
				System.out.println("Duplicate element is : " + Math.abs(ar[i]));
			}
		}

	}	

	public static void main(String[] args) {

		// int ar[] = { 3, 4, 1, 2, 4, 5 };
		//int ar[] = { 1, 2, 2, 3, 1 };
		int ar[] = {1, 2, 3, 6, 3, 6, 1};
		findDuplicateNumbers(ar);

	}
}
