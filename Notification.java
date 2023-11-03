public class Notification extends Purchasing{
    // Attributes
    int notification_id;
    
    static String[][] dataPurchase = {{"0","0","0","12","Ter","0871913872","Thapho","Wait","2023-10-10"}};
    // Constructor
    public Notification(int id) {
        super(dataPurchase[id]);
        this.notification_id = Integer.parseInt(dataPurchase[id][0]);

    }

    
}