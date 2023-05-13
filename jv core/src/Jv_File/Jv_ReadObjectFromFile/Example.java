package Jv_File.Jv_File.Jv_ReadObjectFromFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Example {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_File\\Jv_File\\Jv_WriteObjectToFile\\ReadFile.txt");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            Student st = (Student) ois.readObject();
            System.out.println(st);
            ois.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
