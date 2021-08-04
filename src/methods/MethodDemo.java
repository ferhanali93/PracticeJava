package methods;


public class MethodDemo {
    public static void main(String[] args) {
        //1
        MethodDemo obj = new MethodDemo(); // Creating an object of a class
        obj.sendText();

        //2
        new MethodDemo().sendText();

    }
    public void sendText(){
        System.out.println("sending text....");
    }
}
