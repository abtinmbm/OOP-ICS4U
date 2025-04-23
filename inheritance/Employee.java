package study.inheritance;

import study.basics.Person;

/**
 * INHERITANCE: Creating a new class that is based on an existing class
 * Employee IS-A Person (inheritance relationship)
 * 
 * SUBCLASS/DERIVED CLASS: Employee inherits from Person
 * SUPERCLASS/BASE CLASS: Person is the parent class
 * 
 * Employee inherits all non-private members (fields and methods) from Person
 */
public class Employee extends Person {
    
    private String employeeId;
    private double salary;
    
    /**
     * CONSTRUCTOR in subclass
     * Note the use of super() to call the constructor of the parent class
     */
    public Employee(String name, int age, String employeeId, double salary) {
        // SUPER: Calls the constructor of the immediate parent class
        // Must be the first statement in the constructor
        super(name, age);
        
        this.employeeId = employeeId;
        this.salary = salary;
        
        // We can access protected members inherited from Person
        this.address = "Company Address"; // address is protected in Person
        
        // But we cannot access private members directly
        // this.name = "Test"; // This would cause a compilation error
    }
    
    public String getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    /**
     * METHOD OVERRIDING: Providing a new implementation for a method defined in the parent class
     * Note the @Override annotation which is a good practice to ensure we are actually overriding
     */
    @Override
    public void introduce() {
        // We can call the parent's version using super
        super.introduce(); // Calls Person's introduce method first
        System.out.println("I am an employee with ID: " + employeeId);
    }
    
    /**
     * This method is specific to Employee and doesn't exist in Person
     */
    public void calculateYearlySalary() {
        System.out.println("Yearly salary: " + (salary * 12));
    }
    
    /**
     * METHOD OVERLOADING in the subclass: Multiple methods with the same name but different parameters
     */
    public void calculateYearlySalary(double bonusPercentage) {
        double yearlyBase = salary * 12;
        double bonus = yearlyBase * (bonusPercentage / 100);
        System.out.println("Yearly salary with bonus: " + (yearlyBase + bonus));
    }
}
