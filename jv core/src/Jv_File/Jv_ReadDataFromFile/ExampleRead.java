package Jv_File.Jv_ReadDataFromFile;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ExampleRead {
    public static void main(String[] args) {
//        File f = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_File\\Jv_File\\Jv_WriteDataInFile\\writetest1.bin");
//        try {
//            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//            String numberOfLine = null;
//            while (true) {
//                numberOfLine = br.readLine();
//                if(numberOfLine == null) {
//                    break;
//                }else {
//                    System.out.println(numberOfLine);
//                }
//            }
//        }catch (Exception e) {
//            e.printStackTrace();
//        }

        File f2 = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_File\\Jv_File\\Jv_WriteDataInFile\\writetest1.bin");
        try {
            List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
            for(String result : allText) {
                System.out.println(result);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
