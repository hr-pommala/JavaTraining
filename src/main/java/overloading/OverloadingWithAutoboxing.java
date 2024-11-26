package overloading;

public class OverloadingWithAutoboxing {

    // Method accepting an Integer (wrapper class)
    public void display(Integer a) {
        System.out.println("Integer: " + a);
    }

    // Method accepting an int (primitive type)
    public void display(int a) {
        System.out.println("int: " + a);
    }

    public static void main(String[] args) {
        OverloadingWithAutoboxing obj = new OverloadingWithAutoboxing();

        // Passing an int (primitive) - This will call the display(int a) method
        obj.display(10);

        // Passing an Integer (wrapper object) - This will call the display(Integer a) method
        obj.display(new Integer(20));

        // Passing an int, but autoboxing occurs, converting int to Integer
        Integer num = 30;
        obj.display(num);  // This will call display(Integer a) due to autoboxing
    }
}
