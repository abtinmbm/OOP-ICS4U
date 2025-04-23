package study.polymorphism;

/**
 * Subclass for demonstrating polymorphism
 */
public class Dog extends Animal {
    
    private String breed;
    
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    
    /**
     * METHOD OVERRIDING: Runtime polymorphism
     * The behavior depends on the actual object type at runtime
     */
    @Override
    public void makeSound() {
        System.out.println(name + " says Woof!");
    }
    
    public String getBreed() {
        return breed;
    }
    
    // Dog-specific method
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}
