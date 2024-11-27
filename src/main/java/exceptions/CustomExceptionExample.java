package exceptions;

public class CustomExceptionExample {
	public static void main(String[] args) {
		try {
			validateAge(16);
		} catch (InvalidAgeException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be at least 18.");
		}
		System.out.println("Age is valid.");
	}
}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}