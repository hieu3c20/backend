package Jv_File.Jv_File.Jv_RenameMoveCopyfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class RenameMoveCopyFile {

    public static void copyAllMethod(File f1, File f2) {
        try {
//            Copy itself
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e) {
            e.printStackTrace();
        }
        if(f1.isDirectory()) {
//            copy sub folder and file
            File[] subArray = f1.listFiles();
            for (File addFor : subArray) {
                File addForNewFile = new File(f2.getAbsoluteFile() + "/" + addFor.getName() );
                copyAllMethod(addFor, addForNewFile);
            }
        }
    }
    public static void main(String[] args) {
    /*

        File f0 = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_RenameMoveCopyfile\\TestFile\\Test1.txt");
        File f1 = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_RenameMoveCopyfile\\TestFile\\Test2.txt");
        File f2 = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_RenameMoveCopyfile\\TestFile\\Test3.txt");
     */

//    Rename file or folder
//    Use File class to rename
        /*
        f2.renameTo(f0);
        try {
            Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch (
                IOException e) {
            e.printStackTrace();
        }
        }
        */

//      2.move file
        /*
        File f2_new = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_RenameMoveCopyfile\\MoveFile\\FileAfterMove.binnn");
        try {
            Files.move(f1.toPath(), f2_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
         */

//        3. Copy file
        File f_0 = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_RenameMoveCopyfile\\CopyFile");
        File f_0Copy = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_RenameMoveCopyfile\\CopyFileDone");
        try {
            Files.copy(f_0.toPath(), f_0Copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e) {
            e.printStackTrace();
        }
        RenameMoveCopyFile.copyAllMethod(f_0, f_0Copy);
    }
}
