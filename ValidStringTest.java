package test;

public class ValidStringTest {

	private static boolean isValidText(String str) {

		int len = str.length();
		if( len >=10000 || len ==0) return false;
		if(len ==1) return true;
		
		int countUppercaseChar = 0;
		int countLowerCaseChar = 0;
		
		// if first character is uppercase
		if (Character.isUpperCase(str.charAt(0))) {
			for (int i = 1; i < len; i++) {
				if (Character.isUpperCase(str.charAt(i))) {
					++countUppercaseChar;
				} else {
					++countLowerCaseChar;
				}
			}
		}
		//if first character is lowercase
		else {
			for (int i = 1; i < len; i++) {
				if (Character.isLowerCase(str.charAt(i))) {
					++countLowerCaseChar;
				}
			}
		}

		return countUppercaseChar == len - 1 || countLowerCaseChar == len - 1;

	}

	public static void main(String[] args) {

		boolean isValid1 = isValidText("Ashish");
		if(isValid1)System.out.println("Valid text"); else System.out.println("Invalid text");
		
		boolean isValid2 = isValidText("ASHISH");
		if(isValid2)System.out.println("Valid text"); else System.out.println("Invalid text");
		
		boolean isValid3 = isValidText("ashish");
		if(isValid3)System.out.println("Valid text"); else System.out.println("Invalid text");
		
		boolean isValid4 = isValidText("ASsISH");
		if(isValid4)System.out.println("Valid text"); else System.out.println("Invalid text");
		
		boolean isValid5 = isValidText("ashIsh");
		if(isValid5)System.out.println("Valid text"); else System.out.println("Invalid text");
		
	}

}
