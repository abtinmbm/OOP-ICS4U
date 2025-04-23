# Key OOP Vocabulary and Concepts

## Fundamental OOP Concepts

### Class
- A blueprint or template for creating objects
- Defines attributes (fields) and behaviors (methods) that objects will have
- Example: `public class Person { ... }`

### Object
- An instance of a class
- Has state (fields) and behavior (methods)
- Created using the `new` keyword
- Example: `Person person = new Person();`

### Encapsulation
- Bundling of data and methods that operate on that data within a single unit (class)
- Hiding internal state and requiring all interaction to be performed through an object's methods
- Achieved using access modifiers and getter/setter methods
- Benefits: Improved maintainability, flexibility, and security

### Modifiers
- Keywords that specify properties of classes, methods, and fields

#### Access Modifiers
- **public**: Accessible from any class
- **private**: Accessible only within the declaring class
- **protected**: Accessible within the package and by subclasses
- **default** (no modifier): Accessible only within the package

#### Non-Access Modifiers
- **static**: Belongs to the class rather than instances
- **final**: Cannot be changed (for variables), cannot be overridden (for methods), or cannot be subclassed (for classes)
- **abstract**: Cannot be instantiated (for classes) or must be implemented by subclasses (for methods)

### Instance vs Class Members

#### Instance Variables/Methods
- Belong to each object/instance of the class
- Accessed through an object reference
- Each object has its own copy
- Example: `person.name`, `person.introduce()`

#### Class Variables/Methods (static)
- Belong to the class itself, not instances
- Shared among all instances
- Accessed through the class name
- Example: `Person.personCount`, `Person.displayTotalPersons()`

## Inheritance Concepts

### Inheritance
- Mechanism where a class (subclass) can inherit fields and methods from another class (superclass)
- Represents an "is-a" relationship
- Achieved using the `extends` keyword
- Example: `public class Employee extends Person { ... }`

### Superclass/Superclass
- The parent class in an inheritance relationship
- Provides common attributes and behaviors to subclasses

### Subclass/Derived Class
- The child class in an inheritance relationship
- Inherits attributes and behaviors from the parent
- Can add its own fields and methods
- Can override inherited methods

### The `super` Keyword
- References the parent class
- Used to call parent class methods: `super.method()`
- Used to call parent constructor: `super(param1, param2)`

### The `this` Keyword
- References the current object
- Used to differentiate between instance variables and parameters: `this.name = name;`
- Used to call other constructors in the same class: `this(param1, param2)`

## Method Concepts

### Constructor Methods
- Special methods with the same name as the class
- Called automatically when an object is created
- Used to initialize object state
- No return type
- Can be overloaded (multiple constructors with different parameters)

### Method Overloading
- Multiple methods with the same name but different parameters
- Resolved at compile time (static polymorphism)
- Example: `void display()`, `void display(String name)`, `void display(String name, int age)`

### Method Overriding
- Providing a specific implementation in a subclass for a method already defined in the superclass
- Method signature must be the same
- Annotated with `@Override` (good practice)
- Example: `@Override public void introduce() { ... }`

## Advanced OOP Concepts

### Polymorphism
- The ability of an object to take on many forms
- Two types:
  - **Compile-time polymorphism**: Method overloading
  - **Runtime polymorphism**: Method overriding and dynamic binding

### Abstraction
- Hiding implementation details and showing only functionality
- Achieved using abstract classes and interfaces
- Focuses on what an object does rather than how it does it

### Abstract Classes
- Cannot be instantiated (cannot create objects)
- May contain both abstract and concrete methods
- Abstract methods have no implementation and must be implemented by subclasses
- Example: `public abstract class Vehicle { public abstract void start(); }`

### Abstract Methods
- Declared without implementation
- Must be implemented by non-abstract subclasses
- Example: `public abstract double calculateArea();`

### Interfaces
- A completely abstract type that contains only method signatures and constants
- Classes implement interfaces using the `implements` keyword
- Supports multiple inheritance
- Example: `public interface Drawable { void draw(); }`

### UML (Unified Modeling Language)
- Standardized visual language for modeling software systems
- Class diagrams show static structure (classes, relationships)
- Sequence diagrams show interactions between objects over time
