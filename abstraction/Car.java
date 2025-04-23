package study.abstraction;

/**
 * Concrete implementation of an abstract class
 * Must implement all abstract methods from the parent class
 */
public class Car extends Vehicle {
    
    private int numberOfDoors;
    private double engineSize;
    
    public Car(String make, String model, int year, int numberOfDoors, double engineSize) {
        super(make, model, year); // Call to parent constructor
        this.numberOfDoors = numberOfDoors;
        this.engineSize = engineSize;
    }
    
    /**
     * IMPLEMENTATION OF ABSTRACT METHOD: We must provide implementation for all
     * abstract methods defined in the parent class
     */
    @Override
    public void start() {
        System.out.println("Insert key and turn ignition");
    }
    
    @Override
    public double calculateFuelEfficiency() {
        // For demonstration - simplified calculation based on engine size
        return 30.0 / engineSize; // Smaller engines are generally more efficient
    }
    
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    
    public double getEngineSize() {
        return engineSize;
    }
    
    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }
    
    // Car-specific method
    public void honk() {
        System.out.println("Beep beep!");
    }
}
