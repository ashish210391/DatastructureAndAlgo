package test;

public class StringTest {

	
	public static void main(String[] args) {
		String s1 = new String("Ashish");
		String s2 ="Ashish";
		String s3 = new String("Ashish");
		if(s1==s2) {
			System.out.println("Same reference");
		}
		else {
			System.out.println("Diff reference");
		}
		if(s1==s3) {
			System.out.println("new reference is same");
		}
		else {
			System.out.println("new ref is different");
		}
	}
}
