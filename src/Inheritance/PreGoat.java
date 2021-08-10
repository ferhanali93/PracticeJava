package Inheritance;

 public abstract class PreGoat implements Animal {
     /**
      * Abstract class will implement methods from an interface
      * Abstract class must have at least one abstract method
      * what is abstract methods ?
      *
      */
     @Override
     public void animalSound() {
         System.out.println("animal can make sound");
     }

     @Override
     public void run() {
         System.out.println("Animals can run");
     }
     public abstract void sleep();
 }
