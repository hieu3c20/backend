package Jv_File.Jv_WriteObjectToFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Example {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_File\\Jv_File\\Jv_WriteObjectToFile\\ReadFile.txt");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            Student st = new Student("001", "Ho Van Hieu", 2002, 10);
            oos.writeObject(st);
            oos.flush();
            oos.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
