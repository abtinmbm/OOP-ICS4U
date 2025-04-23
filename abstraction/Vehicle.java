package study.abstraction;

/**
 * ABSTRACT CLASS: A class that cannot be instantiated and may contain abstract methods
 * 
 * Abstract classes are used when:
 * 1. You want to share code among several related classes
 * 2. You want to declare methods that subclasses must implement
 * 3. The class is incomplete and requires subclasses to provide implementations
 */
public abstract class Vehicle {
    
    protected String make;
    protected String model;
    protected int year;
    
    /**
     * Constructor in abstract class - used by subclasses
     */
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    /**
     * ABSTRACT METHOD: A method without implementation
     * Subclasses MUST provide an implementation
     */
    public abstract void start();
    
    /**
     * CONCRETE METHOD in abstract class
     * Subclasses inherit this implementation
     */
    public void displayInfo() {
        System.out.println(year + " " + make + " " + model);
    }
    
    /**
     * Another abstract method that forces subclasses to implement
     */
    public abstract double calculateFuelEfficiency();
    
    // Getters and setters
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
}
