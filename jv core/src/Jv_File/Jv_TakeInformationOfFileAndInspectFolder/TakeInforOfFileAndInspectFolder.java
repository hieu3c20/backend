package Jv_File.Jv_File.Jv_TakeInformationOfFileAndInspectFolder;

import java.io.File;
import java.util.Scanner;

public class TakeInforOfFileAndInspectFolder {
//    Create a variable
    File file;
//    note_Create constructor must have name the same with name of class
    public TakeInforOfFileAndInspectFolder(String fileName) {
        this.file = new File(fileName);
    }

    public void checkExecuted() {
        if (this.file.canExecute()) {
            System.out.println("This file can execute");
        } else {
            System.out.println("This file cannot execute");
        }
    }

    public void checkRead() {
        if(this.file.canRead()) {
            System.out.println("Your file can read");
        } else {
            System.out.println("Your file can not read");
        }
    }

    public void checkWrite() {
        if(this.file.canWrite()) {
            System.out.println("Your file can write");
        }else {
            System.out.println("Your file can not write");
        }
    }

    public void printPath() {
        System.out.println(this.file.getAbsolutePath());
    }

    public void printFileName() {
        System.out.println(this.file.getName());
    }

    public void checkFileOrDirectory() {
        if(this.file.isDirectory()) {
            System.out.println("Your link is folder!");
        }else if(this.file.isFile()) {
            System.out.println("Your link is file");
        }
    }

    public void printSubFiles() {
        if(this.file.isDirectory()) {
            System.out.print("The sub file or sub folder is: ");
            File[] subArrays = this.file.listFiles();
        }else if(this.file.isFile()) {
            System.out.println("This is file, so can not have sub data");
        }
    }

    public void printDetailDiagram(File f, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.print("|_");
        System.out.println(f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] subArray = f.listFiles();
            for (File filename : subArray) {
                printDetailDiagram(filename, level + 1);
            }
        }
    }
    public void printDiagram() {
        this.printDetailDiagram(this.file, 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your file(or folder) name: ");
        String fileName = sc.nextLine();
        TakeInforOfFileAndInspectFolder exFile = new TakeInforOfFileAndInspectFolder(fileName);
        int choice = 0;
        do {
            System.out.println("=======Menu======");
            System.out.println("1. Check if file can execution ");
            System.out.println("2. Check if file can read");
            System.out.println("3. Check if file can write");
            System.out.println("4. Print path");
            System.out.println("5. Print file name");
            System.out.println("6. Check if your file is folder or file(defined file: file have tail)");
            System.out.println("7. Print list sub file");
            System.out.println("8. Print diagram of folder");
            System.out.println("0. Exist program");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    exFile.checkExecuted();
                    break;
                case 2:
                    exFile.checkRead();
                    break;
                case 3:
                    exFile.checkWrite();
                    break;
                case 4:
                    exFile.printPath();
                    break;
                case 5:
                    exFile.printFileName();
                    break;
                case 6:
                    exFile.checkFileOrDirectory();
                    break;
                case 7:
                    exFile.printSubFiles();
                    break;
                case 8:
                    exFile.printDiagram();
                    break;
            }
        } while(choice != 0);
    }
}
