package string;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "Hello, World!";
		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		System.out.println("Reversed String: " + reversed);
		
		String str1 = "Hello, World! Java";
		String[] str2 = str1.split(" ");
		StringBuffer buffer = new StringBuffer();
			
		for (int i = str2.length - 1; i >= 0; i--) {
			buffer.append(str2[i]+" ");
		}
		
		System.out.println(buffer.toString());
 	}
}
