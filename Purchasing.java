// import java.sql.Date;
// import java.text.SimpleDateFormat;

class Purchasing {
    // Attributes
    int purchase_id;
    String customer_id;
    RecycledSteel steel_id;
    float steel_weight;
    String customer_name;
    String customer_tel;
    String customer_address;
    String status;
    String buy_date;

    

    // Constructor
    public Purchasing(String[] dataPurchasing) {
        this.purchase_id = Integer.parseInt(dataPurchasing[0]);
        this.customer_id = dataPurchasing[1];
        this.steel_id = new RecycledSteel(Integer.parseInt(dataPurchasing[2]));
        this.steel_weight = Float.parseFloat(dataPurchasing[3]);
        this.customer_name = dataPurchasing[4];
        this.customer_tel = dataPurchasing[5];
        this.customer_address = dataPurchasing[6];
        this.status = dataPurchasing[7];
        this.buy_date = dataPurchasing[8];
    }


}
