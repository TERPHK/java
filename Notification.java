class Notification extends Purchasing{
    // Attributes
    String notification_id;
    String buy_date;
    //composition โดยการเรียก Attributes ของ Class Customer
    Customer c;
    

    // Constructor
    public Notification(String[] dataPurchasing, String notification_id, String buy_date) {
        super(dataPurchasing);
        this.notification_id = notification_id;
        this.buy_date = buy_date;
    }

    public String displayDetailsCustomer() {
        return c.customer_id + c.customer_name + c.customer_tel + c.customer_email + c.customer_password + c.level; //ตัวอย่างเรียกใช้ composition
    }

    public String displayAddress() {
        return c.customer_address;
    }
}