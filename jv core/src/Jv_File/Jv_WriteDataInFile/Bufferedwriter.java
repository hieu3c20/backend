package Jv_File.Jv_WriteDataInFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bufferedwriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_File\\Jv_WriteDataInFile\\bufferedwriter.txt", true);
            bw = new BufferedWriter(fw);
        }catch (Exception e) {
            System.out.println("Error!");
            System.exit(1);
        }
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        try {
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Age: " + age);
            bw.close();
            System.out.println("Write to file successfully!");
        }catch (Exception e) {
            System.out.println("Write error!");
            System.exit(2);
        }
    }
}
