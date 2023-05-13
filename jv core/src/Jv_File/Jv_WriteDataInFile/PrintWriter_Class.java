package Jv_File.Jv_WriteDataInFile;

import java.io.PrintWriter;

public class PrintWriter_Class {
    public static void main(String[] args) {
        java.io.PrintWriter pw = null;
        try {
            pw = new PrintWriter("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_File\\Jv_WriteDataInFile\\printwriter_class.bin");
        }catch (Exception e) {
            System.out.println("Error! File not found!");
            System.exit(404);
        }
        int ids[] = {15, 25, 30};
        String[] name = {"Hieu", "Thuy", "Hanh"};
        String[] classes = {"3C20", "3C20", "2C20"};
        double score[] = {9.0, 9.1, 9.2};
        pw.println("--------------------------------");
        for (int i = 0; i < ids.length; i++) {
            pw.printf("| %05d | %-15s|%5s |%4.1f |%n", ids[i], name[i], classes[i], score[i]);
        }
        pw.println("---------------------------------");
        pw.flush();
        pw.close();
    }
}
