// import java.sql.Date;
// import java.text.SimpleDateFormat;

class Purchasing {
    // Attributes
    String purchase_id;
    String customer_id;
    String steel_name;
    String steel_id;
    String steel_type;
    float steel_price;
    float steel_weight;
    float steel_amount;

    // Constructor
    public Purchasing(String[] dataPurchasing) {
        this.purchase_id = dataPurchasing[0];
        this.customer_id = dataPurchasing[1];
        this.steel_name = dataPurchasing[2];
        this.steel_id = dataPurchasing[3];
        this.steel_type = dataPurchasing[4];
        this.steel_price = Float.parseFloat(dataPurchasing[5]);
        this.steel_weight = Float.parseFloat(dataPurchasing[6]);
        this.steel_amount = Float.parseFloat(dataPurchasing[7]);
    }

    // Operations
    public void checkType() {
        // Implementation of checkType
    }

    public void checkAmount() {
        // Implementation of checkAmount
    }

    public void displayPurchaseDetails() {
        // Implementation of displayPurchaseDetails
    }
}
