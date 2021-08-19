package test;

public class StringInternTest {

	
	public static void main(String[] args) {
		String s1 = new String("Ashish");
		String s3 = "Ashu";
		String s2=s3.intern();
		
		if(s2==s3)
		{
			System.out.println("same ");
		}
		else {
			System.out.println("diff");
		}
	}
}
