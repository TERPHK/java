public class Employee extends Person {
    private float salary;

    //add Constructor from Person
public Employee(String[] dataPerson,float salaryem){
    super(dataPerson);
    this.salary=salaryem;
    
}

    public String confirmPurchaseOfSteel() {
        String con = getDetailEmployee();
        return con; 
    }

    public String checkOrderSteel() {
       String check = getDetailEmployee();
       return check;
    }
}
