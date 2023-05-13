package Jv_File.Jv_WriteDataInFile;

public class PrintWriter {
    public static void main(String[] args) {
        try {
            java.io.PrintWriter pw = new java.io.PrintWriter("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_File\\Jv_File\\Jv_WriteDataInFile\\writetest1.bin");
            pw.print("This is my friend:");
            pw.print(' ');
            Write_Object wo = new Write_Object(2001040075, "Ho Van Hieu");
            pw.print(wo);
            pw.flush();
            pw.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
