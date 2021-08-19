package arrays;

public class PrintCharacterAndCount {

	private static void printCharAndCount(char ch[]) {

		int len = ch.length;
		int charCount = 1;

		if (len == 0) {
			System.out.println("Not possible");
			return;
		}
		if (len == 1) {
			System.out.println(ch[0] + "--->" + len);
			return;
		}

		for (int i = 0; i < len; i++) {
			if (i < len - 1 && ch[i] == ch[i + 1])
				++charCount;
			else {
				System.out.println(ch[i] + "---->" + charCount);
				charCount = 1;
			}
		}

	}


	private static void   printCharacterAndCountRec(char ar[],int i,int j,int n ){
		
		if(n==0){
			System.out.println("Not possible");
				return;
		}
		if( n==1){
			System.out.println(ar[i]+"--->"+n);
			return;
		}
		if( i==n|| j==n){
			System.out.println(ar[i]+"--->"+((j-i)));
			return;
		}
		if( ar[i] == ar[j]){
			printCharacterAndCountRec(ar, i, j+1, n);

		}
		else {
			System.out.println(ar[i]+"--->"+((j-i)));
			printCharacterAndCountRec(ar, i=j, j+1, n);
		}
		
	}
	public static void main(String[] args) {
		char ch[] = { 'a', 'b', 'c', 'a', 'a', 'c', 'c', 'c', 'b', 'd' };

		printCharAndCount(ch);
		System.out.println("-----Recursive code------");
		printCharacterAndCountRec(ch, 0, 1, ch.length);

	}
}
