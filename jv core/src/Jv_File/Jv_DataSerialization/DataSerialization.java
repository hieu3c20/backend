package Jv_File.Jv_DataSerialization;

import java.io.*;
import java.util.Scanner;

public class DataSerialization {
    public static void main(String[] args) throws IOException {
        String[] names = new String[3];
        double[] prices = new double[3];
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1. Add products\n2. Display products");
            System.out.println("3. Save products\n4. Load products");
            System.out.println("5. Quit\nYour choice: ");
            int n = sc.nextInt();
            if (n == 1) {
                names = new String[]{"Dell", "HP", "lenovo"};
                prices = new double[]{305.1, 402, 292,2};
            }else if(n == 2) {
                for (int i = 0; i < names.length; i++) {
                    System.out.format("%20s | %9.2s | %n", names[i], prices[i]);
                }
            }else if(n == 3) {
                File f = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_File\\Jv_DataSerialization\\data.bin");
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(names);
                oos.writeObject(prices);
                oos.close();
            }else if (n == 5) {
                System.out.println("Goodbye!");
                break;
            }else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
