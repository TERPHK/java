import java.sql.*;
import java.util.Scanner;
import java.util.Date;

public class Employee extends Person {
    private static int salary;

    // add Constructor from Person
    Employee(String[] dataPerson, int salary2) {
        super(dataPerson);
        this.salary = salary2;

    }

    public static void modeEmployee() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println();
            }
            System.out.println("-------------------------------------------------------");
            System.out.println("Menu:");
            System.out.println("1. add steel");
            System.out.println("2. exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    toaddSteel();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static int getSalary() {
        return salary;
    }

    private static void toaddSteel() {
        Scanner scanner = new Scanner(System.in);
       

    }
}
