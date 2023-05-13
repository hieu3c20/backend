package Jv_File.Jv_File.Jv_DeleteFile;

import java.io.File;

public class DeleteFile {

    public static void deleteFile(File x) {
        if(x.isFile()) {
//            delete if if is file
            x.delete();
        }else if(x.isDirectory()){
//            take sub file
            File[] subArray = x.listFiles();
            for(File f : subArray) {
//                delete sub file
                deleteFile(f);
            }
//            delete itself
            x.delete();
        }
    }
// in this recursion we must delete 3 times: file, sub file and itself

    public static void main(String[] args) {
//        use class file to delete file or folder
        File f0 = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_CreateFileAndFolder\\test1\\test.bin");
        File f0_1 = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_CreateFileAndFolder\\test1\\test2\\test3");
        File test1 = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_Collection\\Jv_File\\Jv_CreateFileAndFolder\\test1");
        f0.deleteOnExit();
        f0_1.deleteOnExit();
        test1.deleteOnExit();
        System.out.println(f0_1.delete());

//      use class files to delete file or folder
//        Path p0 = f0.toPath();
//        Path p0_1 = f0_1.toPath();
//        Path p_example = test1.toPath();
//        try {
//            Files.deleteIfExists(p0);
//            Files.deleteIfExists(p0_1);
//            Files.deleteIfExists(p_example);
//
//        }catch(IOException e) {
//            e.printStackTrace();
//        }
    }


}
