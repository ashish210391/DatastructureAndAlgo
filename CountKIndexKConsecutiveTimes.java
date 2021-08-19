package test;

public class CountKIndexKConsecutiveTimes {
	
	
	private static void calculate(int ar[]) {
		
		int len = ar.length;
		int counter = 0;
		int indicateTwo=0;
		int count2[] = new int[15];
		
		for(int i=1;i<len;i+=counter) {
			if(ar[i]-1 == i) {
				counter=0;
				for (int j = i-1; j < i + ar[i]; j++) {
					if (ar[i-1] != ar[j])
						break;
					++counter;

				}
				if (counter == ar[i]) {
					++count2[ar[i]];
				}
				
			}
			else {
				++counter;
			}
		}
		
		for (int i = 0; i < count2.length; i++) {
			if (count2[i] > 0) {
				System.out.println("Element " + i + " has count " + count2[i]);
				++indicateTwo;
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int ar[] = { 3, 3, 2, 2, 5, 5, 5, 5, 5, 3, 3,3, 2, 2 };
		calculate(ar);
	}

}
