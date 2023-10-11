import java.sql.Date;
import java.text.SimpleDateFormat;

class Person {
    String customer_id;
    String customer_name;
    String customer_tel;
    String customer_address;
    String customer_email;
    String customer_password;
    String employee_id;
    String employee_password;
    String employee_name;

    public Person(String[] dataPerson) {
        this.customer_id = dataPerson[0];
        this.customer_name = dataPerson[1];
        this.customer_tel = dataPerson[2];
        this.customer_address = dataPerson[3];
        this.customer_email = dataPerson[4];
        this.customer_password = dataPerson[5];
        this.employee_id = dataPerson[6];
        this.employee_password = dataPerson[7];
        this.employee_name = dataPerson[8];
    }

    public String getDetailCustomer() {
        String detailCutomer = customer_id + " " + customer_name + " " + customer_password + " " + customer_tel + " "
                + customer_address + " " + customer_email; // logic
        return detailCutomer;

    }

    public String getDetailEmployee() {
        String detailEmployee = employee_name + " " + employee_id + " " + employee_password; // logic
        return detailEmployee;
    }

    public void setDetailCustomer(String id, String name, String tel, String address, String email, String password) {
        customer_id = id;
        customer_name = name;
        customer_tel = tel;
        customer_address = address;
        customer_email = email;
        customer_password = password;
    }

    public void setDetailEmployee(String id, String name, String password) {
        employee_id = id;
        employee_name = name;
        employee_password = password;
    }
}
