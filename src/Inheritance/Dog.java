package Inheritance;

public class Dog extends Overriding{
    public static void main(String[] args) {
    Dog dog = new Dog();
    dog.animalSound("Ferhan");
    }

    @Override
    public String animalSound(String name) {
       // super.animalSound();
        System.out.println("wuff wuff");
        System.out.println(name);
    return name;
    }
}
