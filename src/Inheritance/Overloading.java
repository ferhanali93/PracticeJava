package Inheritance;

public class Overloading {
    public static void main(String[] args) {
        /**
         * two or more methods have a same name but different types parameters.
         * You may or may not have same return type.
         *
         */
    }
    public int add(int a, int b){
        System.out.println("a + b" );
        return a+b;
    }

    public void add(int a, int b, int c ){
        System.out.println(a + b + c );
    }
}

