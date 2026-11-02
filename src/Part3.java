// Base class representing a generic vehicle
class Vehicle {
    // Protected fields can be accessed by subclasses in the same package
    protected String brand;
    protected int speed;

    // Constructor to initialize the base vehicle attributes
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Default move method for a generic vehicle
    public void move() {
        System.out.println("Транспортний засіб " + this.brand + " рухається зі швидкістю " + this.speed + " км/год.");
    }
}

// Subclass Car that inherits from the Vehicle class
class Car extends Vehicle {
    // Constructor for Car that passes arguments to the parent class constructor
    public Car(String brand, int speed) {
        super(brand, speed); // Calls the constructor of Vehicle
    }
    public void move() {
        System.out.println("Автомобіль " + this.brand + " їде по дорозі зі швидкістю " + this.speed + " км/год.");
    }
}

// Main class to run and test the inheritance example
public class Part3 {
    public static void main(String[] args) {
        // Instantiate a Car object using the subclass constructor
        Car myCar = new Car("Toyota", 120);

        // Call the overridden move method
        myCar.move();
    }
}
