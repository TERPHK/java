public class Customer extends Person {
    String level;

    //add Constructor from Person
    public Customer(String[] dataPerson,String levelcus){
        super(dataPerson);
        this.level=levelcus;
    }

    public void setCustomerInfoDetails(String level) {
        this.level = level;
    }

    public String carryOutSales() {
        String carry = getDetailCustomer();
        return carry;
        }

    public String confirmOrder() {
        String conorder = getDetailEmployee();
        return conorder;
    }
}
