package exceptions;

//In Java, "ducking" an exception means not handling it directly within a method and instead declaring that the 
//method can throw the exception. This allows the exception to propagate up the call stack to be handled by a 
//method further up.

public class ExceptionDucking {
    public static void main(String[] args) throws Exception {
            methodA();
    }

    static void methodA() throws Exception {
            methodB();
    }

    static void methodB() throws Exception {
        throw new Exception("An error occurred in methodB.");
    }
}

