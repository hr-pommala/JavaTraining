package string;

public class CountCharacter {
	
    public static void main(String[] args) {
    	
        String str = "Hello, how are you?";
        
        System.out.println(str.length());
        
        char ch = 'H';
        
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
        	System.out.println(str.charAt(i) + " "+ch);
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        
        System.out.println("Character '" + ch + "' appears " + count + " times.");
    }
}
