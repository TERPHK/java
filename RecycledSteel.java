public class RecycledSteel {
    static private int steel_id;
    static private String steel_type;
    static private String steel_name;
    static private float steel_weight;
    static private float steel_price;

    static String dataRecylSteel[][] = {{"0","Hot rolled steel","Solid square steel","1","12"}};

    RecycledSteel(int id){
        String[] array = dataRecylSteel[id];
        this.steel_id = Integer.parseInt(array[0]);
        this.steel_type = array[1];
        this.steel_name = array[2];
        this.steel_weight = Float.parseFloat(array[3]);
        this.steel_price = Float.parseFloat(array[4]);

    }

    public static void addSteel(String[] newRecord){
        int nextId = 1;
        if (newRecord.length != 5) {
            System.out.println("Invalid data format. Please provide an array with 5 elements.");
            return;
        }

        String[] formattedRecord = new String[5];
        formattedRecord[0] = String.valueOf(nextId++);
        for (int i = 1; i < 5; i++) {
            formattedRecord[i] = newRecord[i - 1];
        }

        // Create a new array to accommodate the additional record
        String[][] newData = new String[dataRecylSteel.length + 1][];
        for (int i = 0; i < dataRecylSteel.length; i++) {
            newData[i] = dataRecylSteel[i];
        }
        newData[dataRecylSteel.length] = formattedRecord;

        dataRecylSteel = newData;
    }

    public static void displayInfoSteel(){
        for (int i = 0; i < dataRecylSteel.length; i++) {
            System.out.println("ID :"+dataRecylSteel[i][0]+" , Steel Type :"+dataRecylSteel[i][1]+" , Weight :"+dataRecylSteel[i][2]+" , Price :"+dataRecylSteel[i][2]);
        }
    }
}
