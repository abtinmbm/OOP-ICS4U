package study.interfaces;

/**
 * Concrete class that extends an abstract class (Shape) and must implement
 * all remaining abstract methods from both the parent class and the interface
 */
public class Circle extends Shape {
    
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    /**
     * Implementation of abstract method from Drawable interface
     */
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }
    
    /**
     * Implementation of abstract method from Drawable interface
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Circle-specific method
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
