public class Car {
    String make;
    String  model;
    int year;
    String color;

    // Custom Constructor
    public Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public static void main(String[] args) {

        Car bmw = new Car("Bmw", "X5", 2021, "Black");

        System.out.println(bmw.color);
    }
    public void speedUp(){
        System.out.println("speeding ...");
    }
}

