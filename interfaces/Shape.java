package study.interfaces;

/**
 * Abstract class implementing an interface
 * 
 * Note:
 * - An abstract class doesn't have to implement all methods from an interface
 * - Non-abstract classes that extend this class must implement all remaining abstract methods
 */
public abstract class Shape implements Drawable {
    
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // Note: We're not implementing draw() or getArea() here
    // So concrete subclasses will need to implement them
    
    // We can override the default method from the interface
    @Override
    public void displayType() {
        System.out.println("This is a " + color + " shape.");
    }
}
