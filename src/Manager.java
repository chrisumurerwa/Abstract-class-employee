
class Manager extends Employee {
    int base;
    int bonus;

    Manager(String name, int base, int bonus) {
        super(name);
        this.base = base;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        int answer =0;
        try{

            answer =  base / bonus;


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return  answer;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager: " + name + " | Salary: " + calculateSalary());
    }
}
