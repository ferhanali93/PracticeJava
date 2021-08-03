package basic;


public class MethodDemo {
    public static void main(String[] args) {
        MethodDemo obj = new MethodDemo();
        obj.sendText();

        new MethodDemo().sendText();

    }
    public void sendText(){
        System.out.println("sending text....");
    }
}
