package Inheritance;

public class Bear extends Goat{
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.animalSound();

    }
    public void animalSound(){
        System.out.println("Bear can make sound");
    }
}
