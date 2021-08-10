package basic;

import java.lang.management.GarbageCollectorMXBean;

public class ConstantClass {
    public static void main(String[] args) throws Throwable {

        int a = 5; // This is fixed
        int  b = 10;
        System.out.println(a);

        /**
         * Final Keyword: once you declare any variable, method, or class as final, it cannot be changed
         * finally: Its a block of code comes after try-catch block
         * finalize method: Used for garbage collection
         *
         * Java Memory Leak
         * Java Memory: Two parts
         * 1. stack: Stores variables and its small compared heap, Also stores references to object
         * 2. Heap: Stores objects
         */



    }
}
