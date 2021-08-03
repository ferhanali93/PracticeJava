package basic;

public class MethodDemo2 {
    public static void main(String[] args) {
        sendMessage();
        receiveMessage("Danish", "Bangash");
    }
    public static void sendMessage(){
        System.out.println("Sending message....");
    }
    public static void receiveMessage(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }
}
