
class Programmer extends Employee {
     int hours;
     double rate;

     Programmer(String name, int hours, double rate) {
         super(name);
         this.hours = hours;
         this.rate = rate;
     }

     @Override
     public double calculateSalary() {
         return hours * rate;
     }

     @Override
     public void displayInfo() {
         System.out.println("Programmer: " + name + " | Salary: " + calculateSalary());

     }
 }