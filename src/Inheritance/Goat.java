package Inheritance;

public class Goat extends PreGoat {
    public static void main(String[] args) {
        Goat goat = new Goat();
        goat.animalSound();
        goat.sleep();
        goat.run();

        /**
         * Interface can only be implemented
         * Abstract class can be extend
         * Actual class can be extend
         */
    }

    @Override
    public void sleep() {
        System.out.println("Goat can sleep");
    }

    @Override
    public void animalSound() {
        System.out.println("Goat can make sound");

    }

    @Override
    public void run() {
        System.out.println("Goat can run");
    }
}
