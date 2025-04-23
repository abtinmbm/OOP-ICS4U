package study.polymorphism;

/**
 * Base class for demonstrating polymorphism
 * 
 * POLYMORPHISM: The ability of an object to take on many forms
 * - An object can be accessed through different reference types
 * - The behavior of a method depends on the actual object type, not the reference type
 */
public class Animal {
    
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    /**
     * This method will be overridden by subclasses (runtime polymorphism)
     */
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
    /**
     * This shows METHOD OVERLOADING (compile-time polymorphism)
     * Same method name but different parameters
     */
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
    
    public void eat(String food, int quantity) {
        System.out.println(name + " is eating " + quantity + " " + food);
    }
    
    public String getName() {
        return name;
    }
}
