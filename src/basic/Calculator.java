package basic;





public final class Calculator  {

    public static void main(String[] args) {
        int actual = add(2, 3);
        int expected = 5;



        /**
         * DO positive and negative testing
         * Exceptions: 1: Try-Catch 2: throws exceptions
         */



        if(actual==expected){
            System.out.println("You are right ");
        }else {
            System.out.println("you are wrong");
        }

        try {
            divide(2, 0);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("Error");
        }
    }





    public static int add (int a, int b){
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static void divide(int a, int b) {
        int sum = a/b;
        System.out.println(sum);
    }


    }


