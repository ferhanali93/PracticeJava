package Inheritance;

import java.sql.SQLOutput;

public class Overriding {
    /**
     * OverRiding
     * The method name should be the same as the super class method
     * But different method body (method implementation)
     *
     * Static keyword would not work
     * it has to be the same return type
     */
    public String  animalSound(String name ){
        System.out.println("meo meo");

    return name;
    }

}
