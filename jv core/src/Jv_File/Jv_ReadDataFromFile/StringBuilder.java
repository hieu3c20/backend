package Jv_File.Jv_ReadDataFromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class StringBuilder {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("stringbuilder.txt"));
            StringBuilder sb = new StringBuilder();
            String line = "";
            while (line != null) {
                line = br.readLine();
                sb.toString();
            }
            System.out.println(sb.toString());
        }catch (Exception e) {
            System.out.println("Error!");
            e.printStackTrace();
        }


    }
}
