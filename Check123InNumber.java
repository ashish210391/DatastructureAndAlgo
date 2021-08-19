package arrays;

public class Check123InNumber {

	private static void verifyNumbers(int ar[]) {

		for (int i = 0; i < ar.length; i++) {

			String num = String.valueOf(ar[i]);
			verify(num);
		}

	}

	private static void verify(String num) {
		int oneCounter = 0;
		int twoCounter = 0;
		int threeCounter = 0;
		for (int j = 0; j < num.length(); j++) {
			if (num.charAt(j) == '1')
				oneCounter++;
			else if (num.charAt(j) == '2')
				twoCounter++;
			else if (num.charAt(j) == '3')
				threeCounter++;
		}

		if (oneCounter >= 1 && twoCounter >= 1 && threeCounter >= 1)
			System.out.println(num);
		num = null;

	}
	
	
	public static void main(String[] args) {
		int numbers[] = { 123, 1232, 456, 234, 32145 };
		verifyNumbers(numbers);

	}
}
