package methods;

public class ReturnTypeMethods {
    public static void main(String[] args) {
        ReturnTypeMethods object = new ReturnTypeMethods();
        object.calculate(10, 20);
    }
    public  int calculate(int a, int b){
        int sum  = a + b;
        System.out.println(sum);
        return sum;
    }
}
