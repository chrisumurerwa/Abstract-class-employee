


class Manager extends Employee {
    double base;
    double bonus;

    Manager(String name, double base, double bonus) {
        super(name);
        this.base = base;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return base + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager: " + name + " | Salary: " + calculateSalary());
    }
}

