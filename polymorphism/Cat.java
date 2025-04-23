package study.polymorphism;

/**
 * Another subclass for demonstrating polymorphism
 */
public class Cat extends Animal {
    
    private boolean isIndoor;
    
    public Cat(String name, boolean isIndoor) {
        super(name);
        this.isIndoor = isIndoor;
    }
    
    /**
     * METHOD OVERRIDING: Runtime polymorphism
     */
    @Override
    public void makeSound() {
        System.out.println(name + " says Meow!");
    }
    
    public boolean isIndoor() {
        return isIndoor;
    }
    
    // Cat-specific method
    public void scratch() {
        System.out.println(name + " is scratching the furniture!");
    }
}
