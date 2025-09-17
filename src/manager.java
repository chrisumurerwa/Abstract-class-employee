public class  manager extends  Employee {

    private  double salary;
    private double bonus;
   public  manager (String employeeName,double salary, double bonus){
       super(employeeName)
       this.salary = salary;
       this.bonus = bonus;
   }

@Override
    public double calculateSalary(){
    return salary + bonus;

}
@Override
    public  void displayInfo() {
    System.out.println("Manager Name: "+ getEmployeeName());
    System.out.println("salary: "+ salary);
    System.out.println("bonus: "+bonus);
    System.out.println("total salary:"+ calaculatesalary());
}
}
