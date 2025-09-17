class  manager extends  Employee {

    private employeeName;
   public  manager (String employeeName){
       super(employeeName)
       this.employeeName = "employeeName";
   }

@Override
    public void calculateSalary(){
    System.out.println(employeeName + is providing salary of "+ employee +" programmer.");

}
}
