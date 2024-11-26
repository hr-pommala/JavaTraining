package overloading;

public class OverloadingWithAutoboxingAmbiguity {

    // Method accepting Integer
    public void display(Integer a) {
        System.out.println("Integer: " + a);
    }

    // Method accepting int
    public void display(int a) {
        System.out.println("int: " + a);
    }

    // Method accepting Object (for general cases)
    public void display(Object a) {
        System.out.println("Object: " + a);
    }

    public static void main(String[] args) {
        OverloadingWithAutoboxingAmbiguity obj = new OverloadingWithAutoboxingAmbiguity();

        // Calling with an int
        obj.display(10);  // Calls display(int a)

        // Calling with an Integer (autoboxed)
        Integer num = 20;
        obj.display(num);  // Calls display(Integer a)

        // Calling with an Object (directly passing Integer object)
        obj.display(new Integer(30)); // Calls display(Integer a)
    }
}

