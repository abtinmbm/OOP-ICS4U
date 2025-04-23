# UML (Unified Modeling Language) in OOP

UML is a standardized modeling language that helps visualize the design of a system. In OOP, different UML diagrams represent different aspects of a software system.

## Class Diagram

Class diagrams show the static structure of a system including:
- Classes
- Attributes
- Methods
- Relationships between classes

### Class Notation
```
+-------------------------+
|       ClassName         |  <- Class name
+-------------------------+
| - privateAttribute      |
| # protectedAttribute    |  <- Attributes with visibility
| + publicAttribute       |
+-------------------------+
| + publicMethod()        |
| # protectedMethod()     |  <- Methods with visibility
| - privateMethod()       |
+-------------------------+
```

### Visibility Notation
- `+` : Public access
- `-` : Private access
- `#` : Protected access
- `~` : Package/Default access

### Relationship Types

1. **Association**: A simple relationship between classes
   ```
   ClassA ----------> ClassB
   ```

2. **Inheritance**: Subclass extends superclass
   ```
   SuperClass
       ^
       |
       |
   SubClass
   ```

3. **Realization/Implementation**: Class implements an interface
   ```
   Interface
       ^
       |
       |
   Implementing Class
   ```

4. **Aggregation**: "Has-a" relationship (hollow diamond)
   ```
   ClassA <>----------> ClassB
   ```

5. **Composition**: "Contains" relationship (filled diamond)
   ```
   ClassA <♦>----------> ClassB
   ```

6. **Dependency**: One class depends on another
   ```
   ClassA - - - - -> ClassB
   ```

## Example UML Class Diagram for Our Code

```
                   +--------------------+
                   |      Person        |
                   +--------------------+
                   | - name: String     |
                   | - age: int         |
                   | # address: String  |
                   | + email: String    |
                   +--------------------+
                   | + getName(): String|
                   | + setName(String)  |
                   | + introduce()      |
                   +--------------------+
                           ^
                           |
                           |
                   +--------------------+
                   |     Employee       |
                   +--------------------+
                   | - employeeId: String|
                   | - salary: double   |
                   +--------------------+
                   | + introduce()      |
                   | + calculateYearlySalary() |
                   +--------------------+
                           ^
                           |
                           |
                   +--------------------+
                   |      Manager       |
                   +--------------------+
                   | - teamSize: int    |
                   +--------------------+
                   | + introduce()      |
                   | + calculateYearlySalary(...) |
                   +--------------------+
```

## Object Diagram

Object diagrams show instances of classes at a specific point in time:

```
:Person
name = "John Doe"
age = 30
address = "123 Main St"
email = "john@example.com"

:Employee
name = "Jane Smith"
age = 28
employeeId = "E1001"
salary = 50000.0

:Manager
name = "Bob Johnson"
age = 42
employeeId = "M2001"
salary = 80000.0
teamSize = 5
```
