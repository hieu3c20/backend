package Jv_File.Jv_File.Jv_CreateFileAndFolder;

import java.io.File;
import java.io.IOException;

public class CreateFileAndFolder {
    public static void main(String[] args) {
//      Method_Check if folder already existed
        File myFile = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_CreateFileAndFolder");
        File myFile2 = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_TakeInformationOfFileAndInspectFolder");
        if (myFile.exists()) {
            System.out.println("This folder already exist");
        } else {
            System.out.println("This folder did not exsit");
        }
        if (myFile2.exists()) {
            System.out.println("This folder already exist");
        } else {
            System.out.println("This folder did not exist");
        }

//      Method_Create new file
//      Create a folder
        File d1 = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_CreateFileAndFolder\\test1");
        d1.mkdir();

        File d2 = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_CreateFileAndFolder\\test1\\test2\\test3");
        d2.mkdirs();
        File file1 = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_CreateFileAndFolder\\test1\\test.bin");
        try {
            file1.createNewFile();
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}