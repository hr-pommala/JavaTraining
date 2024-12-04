
public class StringExample {

	public static void main(String[] args) {
		
		String st1 = "Hello World";
		String st2 = "Hello World";
		
		
		System.out.println(st1 == st2);
		
		String s3 = new String ("Hello World");
		String s4 = new String ("Hello World");
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

	}

}
