package string;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str = "12321"; // 
		//
		String reversed = new StringBuilder(str).reverse().toString();

		if (str.equals(reversed)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
	}
}
