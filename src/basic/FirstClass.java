package basic;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("This is my first class");
        int x = 30;

        // converting dataType

        //method 1 - manually
        double y = (int) x;

        //method 2 - automatically
        double z = x;
        System.out.println(y + "   " + z);

        // Static = you call any method without creating an object.
    }
}
