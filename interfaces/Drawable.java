package study.interfaces;

/**
 * INTERFACE: A completely abstract type that contains only abstract method declarations
 * and constants (public static final)
 * 
 * Interfaces define a contract that implementing classes must follow
 * Used to achieve abstraction and multiple inheritance in Java
 */
public interface Drawable {
    
    // Constant (public static final by default)
    int MAX_BORDER_WIDTH = 10;
    
    // Abstract method (public abstract by default)
    void draw();
    
    // Another abstract method
    double getArea();
    
    // Since Java 8, interfaces can have default methods with implementations
    default void displayType() {
        System.out.println("This is a drawable object.");
    }
    
    // Since Java 8, interfaces can have static methods
    static void printInfo() {
        System.out.println("The Drawable interface defines methods for drawable objects.");
    }
}
