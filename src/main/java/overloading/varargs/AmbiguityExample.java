package overloading.varargs;

public class AmbiguityExample {

    // Method with two int parameters
    public void test(int a, int b) {
        System.out.println("Two integers: " + a + ", " + b);
    }

    // Method with varargs (int... args)
    public void test(int... args) {
        System.out.println("Varargs method called: " + args.length + " arguments");
    }

    public static void main(String[] args) {
        AmbiguityExample example = new AmbiguityExample();
        
        // This will cause a compilation error due to ambiguity
       // example.test(1);  // Which method should be called?
        example.test(1,2); //test method two int arguments will be invoked instead of varargs
        example.test(1,2,3);
        
        //comiplation issue
        //example.test(1l);
    }
}
