// Programmer.java
public class Programmer extends Employee {
    private String programmingLanguage;

    public Programmer(String employeeName, String programmingLanguage) {
        super(employeeName);   // call Employee constructor
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void calculateSalary() {
        System.out.println(getEmployeeName() + " is coding in " + programmingLanguage + ".");
    }
}
