package exceptions;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        
    	Optional<String> optionalString = Optional.ofNullable(null);

        // Instead of checking for null explicitly, use Optional
        String value = optionalString.orElse("Default Value");
        System.out.println(value); // Output: Default Value
    }
}