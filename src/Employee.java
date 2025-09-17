// Abstract class
public abstract class Employee {
    protected String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    // Abstract methods
    public abstract double calculateSalary();
    public abstract void displayInfo();
}
