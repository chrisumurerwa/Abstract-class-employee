abstract class Employee {
    protected String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Abstract methods
    public abstract double calculateSalary();
    public abstract void displayInfo();
}
