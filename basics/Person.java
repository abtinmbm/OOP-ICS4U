package study.basics;

/**
 * The Person class demonstrates basic OOP concepts:
 * 
 * CLASS: A blueprint for creating objects. It defines attributes (fields) and behaviors (methods)
 * that objects of this type will have. This Person class is the template for creating Person objects.
 * 
 * ENCAPSULATION: The bundling of data (fields) and methods that operate on that data within a single unit (class),
 * and restricting direct access to some of the object's components. Note how we use private fields
 * and public methods to control access.
 */
public class Person {
    
    // INSTANCE VARIABLES: Each object (instance) of the Person class has its own copy of these variables
    private String name;        // PRIVATE: Accessible only within this class
    private int age;            // Demonstrates encapsulation - data hiding
    protected String address;   // PROTECTED: Accessible in this class and subclasses
    public String email;        // PUBLIC: Accessible from anywhere
    
    // CLASS VARIABLE (static): Shared among all instances of Person
    // There is only one copy regardless of how many Person objects exist
    public static int personCount = 0;
    
    // CONSTANTS (static final): Class-wide constants that cannot be changed
    public static final int MINIMUM_AGE = 0;
    
    /**
     * DEFAULT CONSTRUCTOR: Called when creating an object with no arguments
     * Constructor Methods are special methods that:
     * 1. Have the same name as the class
     * 2. Have no return type
     * 3. Are called automatically when an object is created using 'new'
     */
    public Person() {
        personCount++; // Increment the static counter each time a Person is created
        this.name = "Unknown";
        this.age = 0;
    }
    
    /**
     * PARAMETERIZED CONSTRUCTOR: Demonstrates method overloading
     * METHOD OVERLOADING: Defining multiple methods with the same name but different parameters
     */
    public Person(String name, int age) {
        this(); // Calls the default constructor first (this refers to the current instance)
        this.name = name; // 'this' keyword refers to the current object's fields
        setAge(age); // Using setter for validation
    }
    
    /**
     * GETTER METHOD: Part of encapsulation, provides controlled access to private fields
     */
    public String getName() {
        return name;
    }
    
    /**
     * SETTER METHOD: Part of encapsulation, provides controlled access to private fields
     * with the ability to validate input before changing the field
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    /**
     * This setter includes validation logic - part of the benefit of encapsulation
     */
    public void setAge(int age) {
        if (age >= MINIMUM_AGE) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative. Setting to minimum age.");
            this.age = MINIMUM_AGE;
        }
    }
    
    /**
     * INSTANCE METHOD: Operates on object instance data
     */
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
    
    /**
     * CLASS METHOD (static): Belongs to the class rather than any instance
     * Can be called without creating an object, using the class name
     * Cannot access instance variables directly (only through an object reference)
     */
    public static void displayTotalPersons() {
        System.out.println("Total number of persons created: " + personCount);
        // Cannot use 'this' in static context or access instance variables directly
        // System.out.println(this.name); // This would cause a compilation error
    }
    
    /**
     * METHOD OVERRIDING: Providing a specific implementation of a method that is already defined 
     * in a parent class. Here we override the toString() method from the Object class.
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
