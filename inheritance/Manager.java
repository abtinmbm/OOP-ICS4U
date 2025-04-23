package study.inheritance;

/**
 * Further inheritance example: Manager extends Employee
 * This demonstrates MULTI-LEVEL INHERITANCE
 * Manager IS-A Employee and also IS-A Person (transitively)
 */
public class Manager extends Employee {
    
    private int teamSize;
    
    public Manager(String name, int age, String employeeId, double salary, int teamSize) {
        // Call the parent constructor (Employee)
        super(name, age, employeeId, salary);
        this.teamSize = teamSize;
    }
    
    public int getTeamSize() {
        return teamSize;
    }
    
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    
    /**
     * METHOD OVERRIDING: Overriding a method that was already overridden in Employee
     */
    @Override
    public void introduce() {
        // Call Employee's version of introduce (which in turn calls Person's)
        super.introduce();
        System.out.println("I manage a team of " + teamSize + " people.");
    }
    
    /**
     * METHOD OVERLOADING: Different version of the same method with different parameters
     */
    public void calculateYearlySalary(double bonusPercentage, double managementBonus) {
        double yearlyBase = getSalary() * 12;
        double bonus = yearlyBase * (bonusPercentage / 100);
        System.out.println("Manager salary with bonuses: " + (yearlyBase + bonus + managementBonus));
    }
}
