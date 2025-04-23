package study.test;

import study.basics.Person;
import study.inheritance.Employee;
import study.inheritance.Manager;
import study.abstraction.Car;
import study.abstraction.Vehicle;
import study.interfaces.Circle;
import study.interfaces.Drawable;
import study.polymorphism.Animal;
import study.polymorphism.Cat;
import study.polymorphism.Dog;

/**
 * Main test class that demonstrates all OOP concepts in action
 */
public class TestMain {
    
    public static void main(String[] args) {
        System.out.println("===== OOP CONCEPTS DEMONSTRATION =====\n");
        
        // ====================================================
        System.out.println("----- CLASSES AND OBJECTS -----");
        // Creating objects (instances) of the Person class
        Person person1 = new Person(); // Using default constructor
        Person person2 = new Person("Alice", 25); // Using parameterized constructor
        
        // Using methods on objects
        person1.setName("Bob");
        person1.setAge(30);
        
        System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge());
        person1.introduce();
        
        System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge());
        person2.introduce();
        
        // Using a static method - called from the class, not an instance
        Person.displayTotalPersons();
        
        // ====================================================
        System.out.println("\n----- INHERITANCE -----");
        Employee employee = new Employee("Charlie", 35, "E123", 5000.0);
        employee.introduce(); // Overridden method
        employee.calculateYearlySalary();
        employee.calculateYearlySalary(10); // Overloaded method
        
        Manager manager = new Manager("Diana", 40, "M456", 8000.0, 5);
        manager.introduce(); // Overridden method
        manager.calculateYearlySalary(15, 2000); // Overloaded method
        
        // ====================================================
        System.out.println("\n----- ABSTRACTION -----");
        // Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2020); // Error! Cannot instantiate abstract class
        
        // Using concrete implementation of abstract class
        Vehicle car = new Car("Toyota", "Corolla", 2020, 4, 2.0); // Polymorphism
        car.displayInfo(); // Calling inherited method
        car.start(); // Calling implemented abstract method
        
        System.out.println("Fuel efficiency: " + car.calculateFuelEfficiency() + " mpg");
        
        // Accessing specific methods requires casting
        if (car instanceof Car) {
            Car actualCar = (Car) car;
            actualCar.honk(); // Car-specific method
        }
        
        // ====================================================
        System.out.println("\n----- INTERFACES -----");
        // Creating object that implements interface
        Circle circle = new Circle("Red", 5.0);
        
        // Using interface reference
        Drawable drawable = circle; // Polymorphism
        
        drawable.draw();
        System.out.println("Area: " + drawable.getArea());
        drawable.displayType(); // Default method from interface
        
        // Static method called from interface itself
        Drawable.printInfo();
        
        // ====================================================
        System.out.println("\n----- POLYMORPHISM -----");
        // Runtime polymorphism - same method call, different behavior
        Animal animal = new Animal("Generic Animal");
        Animal dog = new Dog("Rex", "German Shepherd");
        Animal cat = new Cat("Whiskers", true);
        
        System.out.println("Runtime Polymorphism (Method Overriding):");
        animal.makeSound(); // Calls Animal's version
        dog.makeSound();    // Calls Dog's version
        cat.makeSound();    // Calls Cat's version
        
        // To access specific methods, we need to cast
        if (dog instanceof Dog) {
            ((Dog) dog).fetch(); // Dog-specific method
        }
        
        if (cat instanceof Cat) {
            ((Cat) cat).scratch(); // Cat-specific method
        }
        
        // Compile-time polymorphism (Method Overloading)
        System.out.println("\nCompile-time Polymorphism (Method Overloading):");
        animal.eat();
        animal.eat("fish");
        animal.eat("bones", 3);
        
        // ====================================================
        System.out.println("\n----- CLASS VS INSTANCE MEMBERS -----");
        System.out.println("Total persons before: " + Person.personCount);
        
        Person p3 = new Person("Eve", 22);
        System.out.println("Total persons after: " + Person.personCount);
        
        // Accessing static constant
        System.out.println("Minimum age: " + Person.MINIMUM_AGE);
    }
}
